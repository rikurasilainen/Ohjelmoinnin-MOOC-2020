
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Kuinka vanha olet?");
        int vanha = Integer.valueOf(lukija.nextLine());
        if (vanha < 18) {
            System.out.println("Et ole täysi-ikäinen!");
        } else {
            System.out.println("Olet täysi-ikäinen!");
        }
    }
}
