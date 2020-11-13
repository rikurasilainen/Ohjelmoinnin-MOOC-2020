/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Syottonakyma {
    private Sanakirja sanakirja;
    public Syottonakyma(Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
    }

    public Parent getNakyma() {
        GridPane asettelu = new GridPane();
        Label sanaohje = new Label("Sana");
        Label kaannosohje = new Label("Käännös");
        TextField sanakentta = new TextField();
        TextField kaannoskentta = new TextField();

        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));
        Button lisaaNappi = new Button("Lisää sanapari");
        
        asettelu.add(sanaohje, 0, 0);
        asettelu.add(sanakentta, 0, 1);
        asettelu.add(kaannosohje, 0, 2);
        asettelu.add(kaannoskentta, 0, 3);
        asettelu.add(lisaaNappi, 0, 4);
        
        lisaaNappi.setOnMouseClicked((event) -> {
            sanakirja.lisaa(sanakentta.getText(), kaannoskentta.getText());
            sanakentta.clear();
            kaannoskentta.clear();
        });
        return asettelu;
    }
}
