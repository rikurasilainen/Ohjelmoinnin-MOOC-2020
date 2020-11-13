package tekstitilastointia;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TekstitilastointiaSovellus extends Application {

    public static void main(String[] args) {
        launch(TekstitilastointiaSovellus.class);
    }

    @Override
    public void start(Stage ikkuna) throws Exception {  
        BorderPane asettelu = new BorderPane();
        TextArea teksti = new TextArea();
        HBox tekstit = new HBox();        
        tekstit.setSpacing(20);
        
        Label kirjaimia = new Label("Kirjaimia: 0");
        Label sanoja = new Label("Sanoja on: 0");
        
        Label pisin = new Label("pisin sana on:");
        tekstit.getChildren().add(kirjaimia);
        tekstit.getChildren().add(sanoja);
        tekstit.getChildren().add(pisin);
        
        asettelu.setCenter(teksti);
        asettelu.setBottom(tekstit);
        
        teksti.textProperty().addListener((muutos, vanha, uusi) -> {
            int merkit = uusi.length();
            String[] palat = uusi.split(" ");
            int sanat = palat.length;
            String pisinA = Arrays.stream(palat).sorted((sana1, sana2) -> sana2.length() - sana1.length())
                    .findFirst().get();
            kirjaimia.setText("Kirjaimia: " + merkit);
            sanoja.setText("Sanoja: " + sanat);
            pisin.setText("Pisin sana on: " + pisinA);
        });
        Scene skene = new Scene(asettelu);
        ikkuna.setScene(skene);
        ikkuna.show();
    }
}
