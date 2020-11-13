
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner scanner, Sanakirja sanakirja) {
        this.lukija = scanner;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista() {       
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                System.out.println("Hei hei!");
                break;
            }   else if (komento.equals("lisaa")) {
                System.out.println("Sana:");
                String sana = lukija.nextLine();
                System.out.println("Käännös:");
                String kaannos = lukija.nextLine();
                this.sanakirja.lisaa(sana, kaannos);
            } else if (komento.equals("hae")) {
                System.out.println("Haettava:");
                String haettava = lukija.nextLine();
                String kaannos = sanakirja.kaanna(haettava);
                if (kaannos == null) {
                    System.out.println("Sanaa " + haettava + " ei löydy");
                } else {
                    System.out.println("Käännös " + kaannos);
                }
            } else {
                                System.out.println("Tuntematon komento");
            }           
        }
    }    
}
