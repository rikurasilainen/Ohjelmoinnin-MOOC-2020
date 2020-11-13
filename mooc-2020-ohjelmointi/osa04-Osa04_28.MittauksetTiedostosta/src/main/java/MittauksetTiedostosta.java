
import java.nio.file.Paths;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        int luvut = 0;
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                int luettu = Integer.valueOf(tiedostonLukija.nextLine());
                if (luettu >= alaraja && luettu <= ylaraja) {
                    luvut++;
                }
   
            }
        } catch (Exception e) {
            System.out.println("Virhe.");
        }
        System.out.println("Lukuja: " + luvut);

    }

}
