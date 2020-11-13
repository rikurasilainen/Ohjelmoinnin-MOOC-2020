package nappijatekstikentta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class NappiJaTekstikenttaSovellus extends Application {


    public static void main(String[] args) {
                launch(NappiJaTekstikenttaSovellus.class);
         
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button nappi = new Button("nappi");
        TextField teksti = new TextField("teksti");
        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(nappi);
        fp.getChildren().add(teksti);
        
        Scene nakyma = new Scene(fp);
        
        stage.setScene(nakyma);
        stage.show();
        
    }   
}
