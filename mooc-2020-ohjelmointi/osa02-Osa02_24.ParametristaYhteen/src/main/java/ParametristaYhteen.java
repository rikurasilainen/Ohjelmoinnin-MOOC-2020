
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(4);

    }

    public static void tulostaLuvustaYhteen(int luku) {
        luku += 1;
        while (luku > 1) {
            luku--;
            System.out.println(luku);
        }
    }

}
