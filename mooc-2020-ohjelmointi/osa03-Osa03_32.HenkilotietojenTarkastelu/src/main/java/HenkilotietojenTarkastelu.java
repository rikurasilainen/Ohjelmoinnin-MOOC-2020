
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int pisin = 0;
        String pitka = "";
        int vuodet = 0;
        int lkm = 0;
        
        
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(",");
            String nimi = palat[0];    
            if (nimi.length() > pisin) {
                pisin = nimi.length();
                pitka = nimi;
            }
            vuodet += Integer.valueOf(palat[1]);
            lkm++;
        }
        
        System.out.println("Pisin nimi: " + pitka);
        System.out.println("Syntymavuosien keskiarvo: " + (1.0 * vuodet / lkm));
        



    }
}
