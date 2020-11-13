
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true) {
            System.out.println("Nimi:");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.println("Sivuja:");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.println("Julkaisuvuosi:");
            int vuosi = Integer.valueOf(lukija.nextLine());
            Kirja kirja = new Kirja(nimi, sivuja, vuosi);
            kirjat.add(kirja);          
        }
        
        System.out.println("Mitä tulostetaan?");
        String mita = lukija.nextLine();
        
        if (mita.equals("kaikki")) {
            for (Kirja k: kirjat) {
                System.out.println(k.toString());
            }
        } else if (mita.equals("nimi")){           
            for (Kirja k: kirjat) {
                System.out.println(k.nimi());
            }
            
            
        }
            
        

    }
}
