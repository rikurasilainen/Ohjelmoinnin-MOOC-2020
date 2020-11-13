package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class HymioSovellus extends Application {


    public static void main(String[] args) {
        launch(HymioSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Canvas taulu = new Canvas(450, 350);
        GraphicsContext piirturi = taulu.getGraphicsContext2D();
        piirturi.setFill(Color.BLACK);
        
        BorderPane asettelu = new BorderPane();
        asettelu.setCenter(taulu);
        
        piirturi.fillOval(150, 50, 50, 50);
        piirturi.fillOval(250, 50, 50, 50);
        piirturi.fillRect(100, 150, 50, 50);
        piirturi.fillRect(150, 200, 50, 50);
        piirturi.fillRect(200, 200, 50, 50);
        piirturi.fillRect(250, 200, 50, 50);
        piirturi.fillRect(300, 150, 50, 50);
        
        Scene nakyma = new Scene(asettelu);
        stage.setScene(nakyma);
        stage.show();
        
    }

}
