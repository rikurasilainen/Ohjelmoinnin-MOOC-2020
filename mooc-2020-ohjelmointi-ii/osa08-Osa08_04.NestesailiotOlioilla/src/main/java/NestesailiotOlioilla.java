
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio eka = new Sailio();
        Sailio toka = new Sailio();

        while (true) {
            System.out.println("Ensimmäinen: " + eka.toString());
            System.out.println("Toinen: " + toka.toString());
            System.out.print("> ");
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }

            String osat[] = luettu.split(" ");
            int maara = Integer.valueOf(osat[1]);
            String komento = osat[0];

            if (komento.equals("lisaa")) {
                eka.lisaa(maara);
            }

            if (komento.equals("siirra")) {
                int siirrettava = 0;
                if (!(maara < siirrettava)) {
                    if (maara > eka.sisalto()) {
                        siirrettava = eka.sisalto();
                    } else {
                        siirrettava = maara;
                    }
                    toka.lisaa(siirrettava);
                    eka.poista(siirrettava);

                }
            }

            if (komento.equals("poista")) {
                toka.poista(maara);
            }
        }
    }
}
