
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(2);
        

    }
    
    public static void tulostaLukuunAsti(int luku) {
        int i = 0;
        while (i < luku) {
            i++;
            System.out.println(i);
        }
    }

}
