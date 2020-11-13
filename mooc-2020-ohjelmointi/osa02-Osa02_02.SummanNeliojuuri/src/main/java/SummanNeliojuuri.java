
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int toinenLuku = Integer.valueOf(lukija.nextLine());
        
        double juuri = Math.sqrt((luku + toinenLuku));
        System.out.println(juuri);
        

    }
}
