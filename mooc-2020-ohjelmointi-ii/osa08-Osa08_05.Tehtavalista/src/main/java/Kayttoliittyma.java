
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

    private Tehtavalista lista;
    private Scanner lukija;

    public Kayttoliittyma(Tehtavalista tehtavalista, Scanner scanner) {
        this.lista = tehtavalista;
        this.lukija = scanner;
    }

    public void kaynnista() {
        while (true) {
            System.out.println("Komento:");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            }
            if (komento.equals("lisaa")) {
                System.out.println("Lisättävä:");
                String lisattava = lukija.nextLine();
                lista.lisaa(lisattava);
            }
            if (komento.equals("listaa")) {
                lista.tulosta();
            }
            if (komento.equals("poista")) {
                System.out.println("Mikä poistetaan?");
                int poistettava = Integer.parseInt(lukija.nextLine());
                lista.poista(poistettava);
            }
        }
    }
}
