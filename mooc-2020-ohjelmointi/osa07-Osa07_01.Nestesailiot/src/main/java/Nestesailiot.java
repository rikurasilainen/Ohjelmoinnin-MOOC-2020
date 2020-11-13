
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka = 0;
        int toka = 0;

        while (true) {                
            System.out.println("Ensimmäinen: " + eka + "/100");
            System.out.println("Toinen: " + toka + "/100");
            System.out.print("> ");
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String osat[] = luettu.split(" ");
            if (osat[0].equals("lisaa")) {
                int lisattava = Integer.valueOf(osat[1]);
                if (lisattava >= 0) {
                    eka += lisattava;
                }
                if (eka > 100) {
                    eka = 100;
                }
            }
            if (osat[0].equals("siirra")) {
                int siirrettava = Integer.valueOf(osat[1]);
                if (siirrettava > eka) {
                    siirrettava = eka;
                }
                eka -= siirrettava;
                if (eka < 0) {
                    eka = 0;
                }
                
                toka += siirrettava;
                if (toka > 100) {
                    toka = 100;
                }       
            }
            if (osat[0].equals("poista")) {
                int poistettava = Integer.valueOf(osat[1]);
                toka -= poistettava;
                if (toka < 0) {
                    toka = 0;
                }
                
            }

        }
    }
}
