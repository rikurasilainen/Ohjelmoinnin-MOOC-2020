
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String merkkijono = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int luku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double liuku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        
        System.out.println("Syötit merkkijonon " + merkkijono);
        System.out.println("Syötit kokonaisluvun " + luku);
        System.out.println("Syötit liukuluvun " + liuku);
        System.out.println("Syötit totuusarvon " + arvo);

    }
}
