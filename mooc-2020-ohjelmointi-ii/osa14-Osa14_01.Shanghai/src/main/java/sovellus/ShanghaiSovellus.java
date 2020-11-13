package sovellus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiSovellus extends Application {

    public static void main(String[] args) {
        launch(ShanghaiSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {

        NumberAxis x = new NumberAxis(2007, 2017, 4);
        NumberAxis y = new NumberAxis();

        x.setLabel("Vuosi");
        y.setLabel("Sijoitus");

        LineChart<Number, Number> kaavio = new LineChart(x, y);
        kaavio.setTitle("Helsingin yliopisto, Shanghai-ranking");

        XYChart.Series shanghai = new XYChart.Series();
        shanghai.getData().add(new XYChart.Data(2007, 73));
        shanghai.getData().add(new XYChart.Data(2008, 68));
        shanghai.getData().add(new XYChart.Data(2009, 72));
        shanghai.getData().add(new XYChart.Data(2010, 72));
        shanghai.getData().add(new XYChart.Data(2011, 74));
        shanghai.getData().add(new XYChart.Data(2012, 73));
        shanghai.getData().add(new XYChart.Data(2013, 76));
        shanghai.getData().add(new XYChart.Data(2014, 73));
        shanghai.getData().add(new XYChart.Data(2015, 67));
        shanghai.getData().add(new XYChart.Data(2016, 56));
        shanghai.getData().add(new XYChart.Data(2017, 56));

        kaavio.getData().add(shanghai);
        Scene nakyma = new Scene(kaavio);
        stage.setScene(nakyma);
        stage.show();
        
    }

}
