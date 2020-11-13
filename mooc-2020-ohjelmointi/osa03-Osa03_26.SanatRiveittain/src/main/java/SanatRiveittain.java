
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String jono = "";
        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("")) {
                break;
            }
            jono = jono + syote + " ";      
        }
        
        String[] palat = jono.split(" ");
        
        for (int i = 0; i < palat.length; i++) {
            System.out.println(palat[i]);
        }
    }
}
