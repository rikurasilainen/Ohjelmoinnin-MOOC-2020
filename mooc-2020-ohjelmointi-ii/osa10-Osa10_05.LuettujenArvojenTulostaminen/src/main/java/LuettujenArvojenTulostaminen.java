
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> jonot = new ArrayList();
        while (true) {
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }
            jonot.add(syote);
        }
        jonot.stream().distinct().forEach(m -> System.out.print(m));
    }
}
