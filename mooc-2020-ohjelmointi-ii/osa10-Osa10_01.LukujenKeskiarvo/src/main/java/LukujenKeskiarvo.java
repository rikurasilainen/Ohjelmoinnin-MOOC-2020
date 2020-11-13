
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<Integer> syotteet = new ArrayList<>();
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("loppu")) {
                break;
            }
            syotteet.add(Integer.valueOf(luettu));          
        }
        double keskiarvo = syotteet.stream().mapToInt(s -> s).average().getAsDouble();
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
    }
}
