
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä niminen tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        
        ArrayList<Ottelu> ottelut = lueOttelut(tiedosto);
        
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan");
        String nimi = lukija.nextLine();
        int otteluita = 0;
        int voittoja = 0;
        int tappioita = 0;
        
        
        for (Ottelu o: ottelut) {
            if (o.getKoti().equals(nimi)) {
                otteluita++;
                if (o.voitto()) {
                    voittoja++;
                } else {
                    tappioita++;
                }
            } else if (o.getVieras().equals(nimi)) {
                otteluita++;
                if (o.voitto()) {
                    tappioita++;
                } else {
                    voittoja++;
                }
            }
        }
        
        System.out.println("Otteluita: " + otteluita);
        System.out.println("Voittoja: " + voittoja);
        System.out.println("Tappioita: " + tappioita);
        
        
        
        

    }
    
    public static ArrayList<Ottelu> lueOttelut(String tiedosto) {
        ArrayList<Ottelu> ottelut = new ArrayList<>();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String[] palat = tiedostonLukija.nextLine().split(",");
                Ottelu ottelu = new Ottelu(palat[0], palat[1], Integer.valueOf(palat[2]),Integer.valueOf(palat[3]));
                ottelut.add(ottelu);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ottelut;

    }
    

}
