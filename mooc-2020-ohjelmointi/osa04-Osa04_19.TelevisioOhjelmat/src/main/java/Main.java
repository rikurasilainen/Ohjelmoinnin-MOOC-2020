
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Nimi:");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Pituus:");
            int pituus = Integer.valueOf(lukija.nextLine());
            TelevisioOhjelma ohjelma = new TelevisioOhjelma(nimi, pituus);
            ohjelmat.add(ohjelma);
        }
        System.out.println("Maksimipituus?");
        int maksimi = Integer.valueOf(lukija.nextLine());
        
        for (TelevisioOhjelma t: ohjelmat) {
            if (t.getPituus() <= maksimi) {
                System.out.println(t.toString());
            }
        }
        

    }
}
