
import java.nio.file.Paths;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get("data.txt"))) {
            while (tiedostonLukija.hasNextLine()) {
                System.out.println(tiedostonLukija.nextLine());
            }                  
        } catch (Exception e) {
            System.out.println("Virhe: " + e);
        }
        

    }
}
