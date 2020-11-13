
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String luku = lukija.nextLine();
            if (luku.equals("loppu")) {
                break;
            }
            System.out.println((Integer.parseInt(luku) * Integer.parseInt(luku) * Integer.parseInt(luku)));         
        }

    }
}
