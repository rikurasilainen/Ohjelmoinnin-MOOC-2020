package lentokentta.ui;

/**
 *
 * @author Vapa MkIV
 */
import lentokentta.domain.Lentokone;
import java.util.Scanner;
import lentokentta.logiikka.Lentohallinta;

public class Tekstikayttoliittyma {

    private Lentohallinta lentohallinta;
    private Scanner lukija;

    public Tekstikayttoliittyma(Lentohallinta hallinta, Scanner lukija) {
        this.lentohallinta = hallinta;
        this.lukija = lukija;
    }

    public void kaynnista() {
        kaynnistaLentokentanHallinta();
        System.out.println();
        kaynnistaLentoPalvelu();
        System.out.println();
    }

    private void kaynnistaLentokentanHallinta() {
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();
        OUTER:
        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Lisää lentokone");
            System.out.println("[2] Lisää lento");
            System.out.println("[x] Poistu hallintamoodista");
            System.out.print("> ");
            String vastaus = lukija.nextLine();
            switch (vastaus) {
                case "1":
                    lisaaLentokone();
                    break;
                case "2":
                    lisaaLento();
                    break;
                case "x":
                    break OUTER;
                default:
                    break;
            }
        }
    }

    private void lisaaLentokone() {
        System.out.println("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.println("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(lukija.nextLine());
        this.lentohallinta.lisaaLentokone(tunnus, kapasiteetti);
    }

    private void lisaaLento() {
        System.out.println("Anna lentokoneen tunnus: ");
        Lentokone lentokone = kysyLentokone();
        System.out.println("Anna lähtöpaikan tunnus: ");
        String lahtotunnus = lukija.nextLine();
        System.out.println("Anna kohdepaikan tunnus: ");
        String kohdetunnus = lukija.nextLine();
        this.lentohallinta.lisaaLento(lentokone, lahtotunnus, kohdetunnus);
    }

    private void kaynnistaLentoPalvelu() {
        System.out.println("Lentopalvelu");
        System.out.println("------------");
        System.out.println();
        OUTER:
        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Tulosta lentokoneet");
            System.out.println("[2] Tulosta lennot");
            System.out.println("[3] Tulosta lentokoneen tiedot");
            System.out.println("[x] Lopeta");
            System.out.println("> ");
            String vastaus = lukija.nextLine();
            switch (vastaus) {
                case "1":
                    tulostaLentokoneet();
                    break;
                case "2":
                    tulostaLennot();
                    break;
                case "3":
                    tulostaLentokone();
                    break;
                case "x":
                    break OUTER;
                default:
                    break;
            }
        }
    }

    private void tulostaLentokoneet() {
        lentohallinta.getLentokoneet().forEach((lentokone) -> {
            System.out.println(lentokone);
        });
    }

    private void tulostaLennot() {
        lentohallinta.getLennot().stream().map((lento) -> {
            System.out.println(lento);
            return lento;
        }).forEachOrdered((_item) -> {
            System.out.println("");
        });
    }

    private void tulostaLentokone() {
        System.out.println("Mikä kone: ");
        Lentokone kone = kysyLentokone();
        System.out.println(kone);
        System.out.println();
    }

    private Lentokone kysyLentokone() {

        Lentokone lentokone = null;
        
        while (lentokone == null) {
            String tunnus = lukija.nextLine();
            lentokone = lentohallinta.haeLentokone(tunnus);
            if (lentokone == null) {

                System.out.println("Tunnuksella " + tunnus + " ei ole lentokonetta.");
            }
        }
        return lentokone;
    }
}
