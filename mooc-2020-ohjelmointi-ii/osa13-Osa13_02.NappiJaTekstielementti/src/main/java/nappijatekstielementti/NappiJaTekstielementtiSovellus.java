package nappijatekstielementti;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class NappiJaTekstielementtiSovellus extends Application {


    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
         
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button nappi = new Button("nappi");
        Label teksti = new Label("teksti");
        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(nappi);
        fp.getChildren().add(teksti);
        
        Scene nakyma = new Scene(fp);
        
        stage.setScene(nakyma);
        stage.show();
        
    }

}
