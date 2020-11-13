
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet [0-100]:");
        int p = Integer.valueOf(lukija.nextLine());
        if (p < 0) {
            System.out.println("mahdotonta!");
        } else if (p <= 49) {
            System.out.println("Arvosana: hylätty");
        } else if (p <= 59) {
            System.out.println("Arvosana: 1");
        } else if (p <= 69) {
            System.out.println("Arvosana: 2");
        } else if (p <= 79) {
            System.out.println("Arvosana: 3");
        } else if (p <= 89) {
            System.out.println("Arvosana: 4");
        }  else if (p <= 100) {
            System.out.println("Arvosana: 5");
        } else {
            System.out.println("Uskomatonta!");
        }

    }
}
