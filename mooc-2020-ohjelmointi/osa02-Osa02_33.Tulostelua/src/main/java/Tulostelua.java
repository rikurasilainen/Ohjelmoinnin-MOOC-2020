
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        while (maara > 0) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        int i = sivunpituus;
        while (i > 0) {
            tulostaTahtia(sivunpituus);
            i--;
            
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        int i = korkeus;
        while (i > 0) {
            tulostaTahtia(leveys);
            i--;
        }
        
    }

    public static void tulostaKolmio(int koko) {
        int i = 0;
        
        // tehtävän neljäs osa
        while (i <= (koko)) {
            tulostaTahtia(i);
            i++;
        }
        
    }
}
