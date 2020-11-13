
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("")) {
                break;
            }
            
            String[] palat = syote.split(" ");
            for (String pala: palat) {
                if (pala.contains("av")) {
                    System.out.println(pala);
                }
            }
            
        }


    }
}
