package otsikko;

import javafx.application.Application;
import javafx.stage.Stage;


public class KayttajanOtsikko extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getParameters().getNamed().get("otsikko"));
        stage.show();
    }


}
