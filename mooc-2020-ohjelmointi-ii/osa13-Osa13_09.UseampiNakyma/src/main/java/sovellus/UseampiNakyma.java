package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UseampiNakyma extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(UseampiNakyma.class);
        
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Button nappi = new Button("Tokaan näkymään!");
        Button nappi2 = new Button("Kolmanteen näkymään!");
        Button nappi3 = new Button("Ekaan näkymään!");
        
        BorderPane bp = new BorderPane();
        bp.setTop(new Label("Eka näkymä!"));
        bp.setCenter(nappi);
        
        VBox vb = new VBox();
        vb.getChildren().add(nappi2);
        vb.getChildren().add(new Label("Toka näkymä!"));
        
        GridPane gp = new GridPane();
        gp.add(new Label("Kolmas näkymä!"), 0, 0);
        gp.add(nappi3, 1, 1);
        
        Scene eka = new Scene(bp);
        Scene toka = new Scene(vb);
        Scene kolmas = new Scene(gp);
        
        nappi.setOnAction((e) -> {
            stage.setScene(toka);
        });
        nappi2.setOnAction((e) -> {
            stage.setScene(kolmas);
        });
        nappi3.setOnAction((e) -> {
            stage.setScene(eka);
        });
        
        stage.setScene(eka);
        stage.show();
        
    }

}
