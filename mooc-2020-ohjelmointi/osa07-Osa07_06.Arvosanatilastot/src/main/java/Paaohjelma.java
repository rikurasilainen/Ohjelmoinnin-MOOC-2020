
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Arvosanat arvosanat = new Arvosanat();

        while (true) {
            System.out.println("Syötä yhteispisteet, -1 lopettaa:");
            int syote = Integer.valueOf(lukija.nextLine());
            if (syote == -1) {
                break;
            }
            arvosanat.lisaaPisteet(syote);
        }
        arvosanat.tuloste();  
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
    }
}
