
import java.util.Scanner;

public class Kayttoliittyma {

    private Scanner lukija;
    private Tietokanta kanta;

    public Kayttoliittyma(Scanner lukija, Tietokanta kanta) {
        this.lukija = lukija;
        this.kanta = kanta;
    }

    public void kaynnista() {
        OUTER:
        while (true) {
            String komento = lukija.nextLine();
            switch (komento) {
                case "Lopeta":
                    break OUTER;
                case "Lisaa":
                    lisaa();
                    break;
                case "Havainto":
                    havainto();
                    break;
                case "Nayta":
                    nayta();
                    break;
                case "Tilasto":
                    tilasto();
                    break;
                default:
                    System.out.println("Tuntematon komento!");
                    break;
            }
        }
    }

    public void havainto() {
        System.out.println("Mikä havaittu?");
        String mika = lukija.nextLine();
        boolean onkoLintu = kanta.havainto(mika);
        if (!onkoLintu) {
            System.out.println(mika + " ei ole lintu");
        }
    }

    public void lisaa() {
        System.out.println("Nimi:");
        String nimi = lukija.nextLine();
        System.out.println("Latinankielinen nimi:");
        String latina = lukija.nextLine();
        kanta.lisaaLintu(nimi, latina);
    }

    public void nayta() {
        System.out.println("Mikä?");
        String mika = lukija.nextLine();
        String onkoLintu = kanta.Nayta(mika);
        if (onkoLintu == null) {
            System.out.println(onkoLintu + " ei ole lintu!");
        } else {
            System.out.println(onkoLintu);
        }
    }

    public void tilasto() {
        System.out.println(kanta.tilasto());
    }

}
