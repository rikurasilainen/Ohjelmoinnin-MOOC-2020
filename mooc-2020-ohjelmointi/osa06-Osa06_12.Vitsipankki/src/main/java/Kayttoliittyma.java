
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
public class Kayttoliittyma {
    private Vitsipankki vitsit;
    private Scanner lukija;

    public Kayttoliittyma(Vitsipankki vitsit, Scanner lukija) {
        this.lukija = lukija;
        this.vitsit = vitsit;
    }

    public void kaynnista() {
        while (true) {
            System.out.println("Komennot:");
            System.out.println(" 1 - lisää vitsi");
            System.out.println(" 2 - arvo vitsi");
            System.out.println(" 3 - listaa vitsit");
            System.out.println(" X - lopeta");
            String komento = lukija.nextLine();
            if (komento.equals("X")) {
                break;
            }
            if (komento.equals("1")) {
                System.out.println("Kirjoita lisättävä vitsi:");
                String vitsi = lukija.nextLine();
                vitsit.lisaaVitsi(vitsi);
            }
            if (komento.equals("2")) {
                System.out.println(vitsit.arvoVitsi());
            }
            
            if (komento.equals("3")) {
                System.out.println("Tulostetaan vitsit.");
                vitsit.tulostaVitsit();
                }
            }
        }
    }


