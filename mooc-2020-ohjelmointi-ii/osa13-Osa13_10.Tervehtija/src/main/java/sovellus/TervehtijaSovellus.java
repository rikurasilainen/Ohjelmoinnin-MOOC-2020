package sovellus;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TervehtijaSovellus extends Application {

    public static void main(String[] args) {
        launch(TervehtijaSovellus.class);
        
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Label ohje = new Label("Kirjoita nimesi ja aloita.");
        TextField kentta = new TextField("");
        Button nappi = new Button("Aloita");
        
        GridPane eka = new GridPane();
        
        eka.add(ohje, 0, 0);
        eka.add(kentta, 0, 1);
        eka.add(nappi, 0, 2);
        eka.setPrefSize(300, 180);
        eka.setAlignment(Pos.CENTER);
        eka.setVgap(10);
        eka.setHgap(10);
        
        StackPane toka = new StackPane();
        toka.setPrefSize(300, 180);
        Label nimi = new Label("");
        
        toka.getChildren().add(nimi);
        toka.setAlignment(Pos.CENTER);
        Scene nakyma = new Scene(eka);
        Scene toinenNakyma = new Scene(toka);
        
        nappi.setOnAction((event) -> {
            nimi.setText("Tervetuloa " + kentta.getText() + "!");
            stage.setScene(toinenNakyma);
        });
        stage.setScene(nakyma);
        stage.show();
    }
}



