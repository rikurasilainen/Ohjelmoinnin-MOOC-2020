
import java.util.ArrayList;
import java.util.Scanner;

public class Henkilotiedot {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Henkilotieto> henkilotiedot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Etunimi:");
            String etu = lukija.nextLine();
            if (etu.isEmpty()) {
                break;
            }
            System.out.println("Sukunumi:");
            String suku = lukija.nextLine();
            System.out.println("Henkilötunnus:");
            String tunnus = lukija.nextLine();           
            Henkilotieto h = new Henkilotieto(etu, suku, tunnus);
            henkilotiedot.add(h);
        }
        for (Henkilotieto h: henkilotiedot) {
            System.out.println(h.getEtunimi() + " " + h.getSukunimi());
        }
        

    }
}
