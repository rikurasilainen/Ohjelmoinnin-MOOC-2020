package sovellus;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SaastolaskuriSovellus extends Application {

    @Override
    public void start(Stage ikkuna) {
        BorderPane tallennusAsettelu = new BorderPane();
        Label kuukausittainenTallennus = new Label("Kuukausittainen tallennus");

        Slider liukuri = new Slider();
        liukuri.setMin(25);
        liukuri.setMax(250);
        liukuri.setValue(25);
        liukuri.setShowTickLabels(true);
        liukuri.setShowTickMarks(true);
        liukuri.setMajorTickUnit(25);
        liukuri.setMinorTickCount(5);
        liukuri.setBlockIncrement(10);
        
        Label arvoKuukausittain = new Label("25");
        tallennusAsettelu.setLeft(kuukausittainenTallennus);
        tallennusAsettelu.setCenter(liukuri);
        tallennusAsettelu.setRight(arvoKuukausittain);
        BorderPane korkoAsetus = new BorderPane();
        Label vuosittainen = new Label("Vuosittainen korko");

        Slider korkoLiukuri = new Slider();
        korkoLiukuri.setMin(0);
        korkoLiukuri.setMax(10);
        korkoLiukuri.setValue(0);
        korkoLiukuri.setShowTickLabels(true);
        korkoLiukuri.setShowTickMarks(false);

        Label korkoTeksti = new Label("0");
        korkoAsetus.setLeft(vuosittainen);
        korkoAsetus.setCenter(korkoLiukuri);
        korkoAsetus.setRight(korkoTeksti);

        VBox sliderit = new VBox();
        sliderit.getChildren().addAll(tallennusAsettelu, korkoAsetus);
        sliderit.setPadding(new Insets(10));
        BorderPane asettelu = new BorderPane();
        asettelu.setTop(sliderit);

        NumberAxis xAkseli = new NumberAxis(0, 30, 1);
        NumberAxis yAkseli = new NumberAxis();

        LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
        viivakaavio.setTitle("Säästölaskuri");
        viivakaavio.setAnimated(false);
        viivakaavio.setLegendVisible(false);
        asettelu.setCenter(viivakaavio);

        XYChart.Series saastot = new XYChart.Series();
        XYChart.Series korkoineen = new XYChart.Series();
        
        viivakaavio.getData().add(saastot);
        viivakaavio.getData().add(korkoineen);
        
        liukuri.setOnMouseReleased(e -> {
            String apuTallennus = "" + liukuri.getValue();
            if (apuTallennus.length() > 5) {
                apuTallennus = apuTallennus.substring(0, 5);
            }
            arvoKuukausittain.setText(apuTallennus);
            paivita(liukuri.getValue(), korkoLiukuri.getValue(), saastot, korkoineen);
        });

        korkoLiukuri.setOnMouseReleased(e -> {
            String korko = "" + korkoLiukuri.getValue();
            if (korko.length() > 4) {
                korko = korko.substring(0, 4);
            }
            korkoTeksti.setText(korko);
            paivita(liukuri.getValue(), korkoLiukuri.getValue(), saastot, korkoineen);
        });
        
        Scene nakyma = new Scene(asettelu, 640, 480);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    public void paivita(double tallenne, double korko, XYChart.Series kuukausiSaastot, XYChart.Series korotPaalle) {
        kuukausiSaastot.getData().clear();
        korotPaalle.getData().clear();
        kuukausiSaastot.getData().add(new XYChart.Data(0, 0));
        korotPaalle.getData().add(new XYChart.Data(0, 0));

        double alkuperainen = 0;

        for (int i = 1; i <= 30; i++) {
            kuukausiSaastot.getData().add(new XYChart.Data(i, i * tallenne * 12));
            alkuperainen += tallenne * 12;
            alkuperainen *= korko / 100.0 + 1;
            korotPaalle.getData().add(new XYChart.Data(i, alkuperainen));
        }
    }

    public static void main(String[] args) {
        launch(SaastolaskuriSovellus.class);
    }
}
