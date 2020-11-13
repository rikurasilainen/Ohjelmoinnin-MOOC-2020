
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Montako satunnaislukua tulostetaan?");
        int montako = lukija.nextInt();
        for (int i = 0; i < montako; i++) {
            System.out.println(r.nextInt(11));
        }
    }

}
