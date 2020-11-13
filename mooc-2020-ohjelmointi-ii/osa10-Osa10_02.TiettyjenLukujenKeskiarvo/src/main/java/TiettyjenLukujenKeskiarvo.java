
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> lista = new ArrayList();
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("loppu")) {
                break;
            }
            lista.add(Integer.valueOf(luettu));
        }

        double keskiarvo = 0;
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String kumpi = lukija.nextLine();
        if (kumpi.equals("p")) {
            keskiarvo = lista.stream()
                    .mapToInt(s -> s)
                    .filter(luku -> luku > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Positiivisten lukujen keskiarvo: " + keskiarvo);
        } else if (kumpi.equals("n")) {
            keskiarvo = lista.stream()
                    .mapToInt(s -> s)
                    .filter(luku -> luku < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Negatiivisten lukujen keskiarvo: " + keskiarvo);
        }
    }
}
