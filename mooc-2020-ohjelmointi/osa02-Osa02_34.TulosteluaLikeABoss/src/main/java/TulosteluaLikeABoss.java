public class TulosteluaLikeABoss {
    public static void tulostaTahtia(int maara) {
        while (maara >= 1) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

 

    public static void tulostaTyhjaa(int maara) {
        int i = 0;
        while (maara > i) {
            System.out.print(" ");
            i++;
        }
    }

 

    public static void tulostaKolmio(int koko) {
        int i = 1;

        while (i <= koko) {
            tulostaTyhjaa(koko - i);
            tulostaTahtia(i);
            i++;
        }
    }
 
    public static void jouluKuusi(int korkeus) {
        int i = 1;
        while (i <= korkeus) {
            tulostaTyhjaa(korkeus - i);
            tulostaTahtia(i + (i - 1));
            i++;
        }
        
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus -2);
        tulostaTahtia(3);
    }

    public static void main(String[] args) {
        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);

    }

}