
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int vanhin = 0;
        String wanha = "";
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(",");
            if (Integer.valueOf(palat[palat.length -1]) > vanhin) {
                vanhin = Integer.valueOf(palat[palat.length -1]);
                wanha = palat[palat.length - 2];
            }
        }
        System.out.println("Vanhimman nimi: " + wanha);


    }
}
