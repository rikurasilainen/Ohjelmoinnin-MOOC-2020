
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus?");
        int lahja = Integer.valueOf(lukija.nextLine());
        
        if (lahja < 5000) {
            System.out.println("Ei veroa!");
        } else if (lahja < 25000) {
            System.out.println("Vero: " + (100 + (lahja - 5000) * 0.08));
        } else if (lahja < 55000) {
            System.out.println("Vero: " + (1700 + (lahja - 25000) * 0.10));
        } else if (lahja < 200000) {
            System.out.println("Vero: " + (4700 + (lahja - 55000) * 0.12));
        } else if (lahja < 1000000) {
            System.out.println("Vero: " + (22100 + (lahja - 200000) * 0.15));
        } else if (lahja > 1000000) {
            System.out.println("Vero: " + (142100 + (lahja - 1000000) * 0.17));
        }
    }
}

    

