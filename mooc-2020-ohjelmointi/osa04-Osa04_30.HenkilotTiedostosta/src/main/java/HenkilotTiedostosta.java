
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();

        ArrayList<Henkilo> henkilot = lueHenkilot(tiedosto);
        System.out.println("Henkilöitä: " + henkilot.size());
        System.out.println("Henkilöt:");
        for (Henkilo henkilo : henkilot) {
            System.out.println(henkilo);

        }
    }

    public static ArrayList<Henkilo> lueHenkilot(String tiedosto) {
        ArrayList<Henkilo> henkilot = new ArrayList<>();
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String[] palat = tiedostonLukija.nextLine().split(",");
                Henkilo henkilo = new Henkilo(palat[0], Integer.valueOf(palat[1]));
                henkilot.add(henkilo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // toteuta henkilöiden lukeminen ja luominen tänne
        return henkilot;

    }
}
