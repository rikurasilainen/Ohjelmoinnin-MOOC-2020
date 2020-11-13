package sovellus;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VitsiSovellus extends Application {

    public static void main(String[] args) {
        launch(VitsiSovellus.class);

    }

    @Override
    public void start(Stage ikkuna) throws Exception {

        BorderPane asettelu = new BorderPane();
        HBox valikko = new HBox();
        valikko.setPadding(new Insets(20, 20, 20, 20));
        valikko.setSpacing(10);

        Button vitsi = new Button("Vitsi");
        Button vastaus = new Button("Vastaus");
        Button selitys = new Button("Selitys");

        valikko.getChildren().addAll(vitsi, vastaus, selitys);
        asettelu.setTop(valikko);

        StackPane vitsiPaneeli = luoNakyma("What do you call a bear with no teeth?");
        StackPane vastausPaneeli = luoNakyma("A gummy bear.");
        StackPane selitysPaneeli = luoNakyma("selitys.");

        asettelu.setCenter(vitsiPaneeli);
        vitsi.setOnAction((e) -> asettelu.setCenter(vitsiPaneeli));
        vastaus.setOnAction((e) -> asettelu.setCenter(vastausPaneeli));
        selitys.setOnAction((e) -> asettelu.setCenter(selitysPaneeli));
        
        Scene nakyma = new Scene(asettelu);
        ikkuna.setScene(nakyma);
        ikkuna.show();
    }

    private StackPane luoNakyma(String teksti) {

        StackPane asettelu = new StackPane();
        asettelu.setPrefSize(300, 180);
        asettelu.getChildren().add(new Label(teksti));
        asettelu.setAlignment(Pos.CENTER);
        return asettelu;
    }
}
