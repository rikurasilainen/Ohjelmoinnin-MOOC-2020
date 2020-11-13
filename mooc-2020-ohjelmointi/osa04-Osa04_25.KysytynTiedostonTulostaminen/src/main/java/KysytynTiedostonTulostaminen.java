
import java.nio.file.Paths;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String tiedosto = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                System.out.println(tiedostonLukija.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        
        

    }
}
