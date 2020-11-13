
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(" ");
            System.out.println(palat[palat.length - 1]);

        }

    }
}
