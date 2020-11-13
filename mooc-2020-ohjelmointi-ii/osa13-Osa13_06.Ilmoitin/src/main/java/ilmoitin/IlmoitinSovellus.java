package ilmoitin;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class IlmoitinSovellus extends Application {


    public static void main(String[] args) {
        launch(IlmoitinSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox komponentit = new VBox();
        TextField tekstikentta = new TextField();
        Button nappi = new Button("Päivitä");
        Label teksti = new Label();
        
        komponentit.getChildren().add(tekstikentta);
        komponentit.getChildren().add(nappi);
        komponentit.getChildren().add(teksti);
        
        nappi.setOnAction((event) -> {
            teksti.setText(tekstikentta.getText());
        });
        
        Scene nakyma = new Scene(komponentit);
        stage.setScene(nakyma);
        stage.show();
        
        
        
    }

}
