
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti?");
        int mihin = Integer.valueOf(lukija.nextLine());     
        System.out.println("Mistä lähtien?");
        int mista = Integer.valueOf(lukija.nextLine());
        
        for (int i = mista; i - 1 < mihin; i++) {
            System.out.println(i);
        }
    }
}
