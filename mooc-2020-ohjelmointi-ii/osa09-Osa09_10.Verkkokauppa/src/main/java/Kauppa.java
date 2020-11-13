
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
public class Kauppa {

    private Varasto varasto;
    private Scanner lukija;

    public Kauppa(Varasto varasto, Scanner lukija) {
        this.varasto = varasto;
        this.lukija = lukija;
    }

    public void asioi(String asiakas) {
        Ostoskori kori = new Ostoskori();
        System.out.println("Tervetuloa kauppaan " + asiakas);
        System.out.println("valikoimamme:");
        for (String tuote : this.varasto.tuotteet()) {
            System.out.println(tuote);
        }

        while (true) {
            System.out.println("mitä laitetaan ostoskoriin (pelkkä enter vie kassalle):");
            String tuote = lukija.nextLine();
            if (tuote.isEmpty()) {
                break;
            }
            if (this.varasto.saldo(tuote) > 0) {
                this.varasto.ota(tuote);
                kori.lisaa(tuote, this.varasto.hinta(tuote));
            }
        }
        System.out.println("ostoskorissasi on:");
        kori.tulosta();
        System.out.println("korin hinta: " + kori.hinta());
    }
}
