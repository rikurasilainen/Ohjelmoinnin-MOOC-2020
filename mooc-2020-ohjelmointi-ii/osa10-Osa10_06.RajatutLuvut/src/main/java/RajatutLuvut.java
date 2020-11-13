
import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList();
        while (true) {
            int luku = lukija.nextInt();
            if (luku < 0) {
                break;
            }
            luvut.add(luku);
        }
        luvut.stream().filter(l -> l > 0 && l < 6).forEach(l -> System.out.print(l));
    }
}
