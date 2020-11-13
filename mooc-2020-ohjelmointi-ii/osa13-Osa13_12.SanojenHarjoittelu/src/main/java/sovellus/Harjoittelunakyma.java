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

public class Harjoittelunakyma {
    private Sanakirja sanakirja;
    private String sana;

    public Harjoittelunakyma(Sanakirja sanakirja) {
        this.sanakirja = sanakirja;
        this.sana = sanakirja.arvoSana();

    }

    public Parent getNakyma() {
        GridPane asettelu = new GridPane();
        Label sanaohje = new Label("Käännä sana '" + this.sana + "'");
        TextField kaannoskentta = new TextField();

        asettelu.setAlignment(Pos.CENTER);
        asettelu.setVgap(10);
        asettelu.setHgap(10);
        asettelu.setPadding(new Insets(10, 10, 10, 10));

        Button nappi = new Button("Tarkista");
        Label palaute = new Label("");

        asettelu.add(sanaohje, 0, 0);
        asettelu.add(kaannoskentta, 0, 1);
        asettelu.add(nappi, 0, 2);
        asettelu.add(palaute, 0, 3);
 
        nappi.setOnMouseClicked((event) -> {
            if (sanakirja.hae(sana).equals(kaannoskentta.getText())) {
                palaute.setText("Oikein!");
            } else {
                palaute.setText("Väärin! Sanan '" + this.sana + "' käännös on '"
                        + sanakirja.hae(sana) + "'.");
            }
            this.sana = this.sanakirja.arvoSana();
            sanaohje.setText("Käännä sana '" + this.sana + "'");
            kaannoskentta.clear();
        });
        
        return asettelu;
    }
}
