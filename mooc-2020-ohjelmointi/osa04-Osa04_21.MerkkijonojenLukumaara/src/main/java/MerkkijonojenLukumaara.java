
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int lkm = 0;
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")) {
                break;
            }
            lkm++;
        }
        System.out.println(lkm);

    }
}
