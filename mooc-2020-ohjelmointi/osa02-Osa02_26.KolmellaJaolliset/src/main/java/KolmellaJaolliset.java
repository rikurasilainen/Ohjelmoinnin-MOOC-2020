
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        

    }
    public static void kolmellaJaollisetValilta(int eka, int vika) {
        while (eka <= vika) {
            if (eka % 3 == 0) {
                System.out.println(eka);
            }
            eka++;
        }
        
        
    }

}
