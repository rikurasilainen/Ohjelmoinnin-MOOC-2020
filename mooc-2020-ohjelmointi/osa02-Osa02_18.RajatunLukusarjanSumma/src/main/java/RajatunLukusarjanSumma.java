
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen:");
        int eka = Integer.valueOf(lukija.nextLine());     
        System.out.println("Viimeinen:");
        int vika = Integer.valueOf(lukija.nextLine());
        int summa = vika;
        
        while (eka != vika) {
            summa += eka;
            eka++;
        }

        
        
        
        System.out.println("Summa on " + summa);
    }
}
