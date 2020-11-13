
import java.util.Arrays;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);

    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i : taulukko) {
            if (i < pienin) {
                pienin = i;
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int pienin = taulukko[0];
        int indeksi = taulukko.length;

        for (int i = 0; i < taulukko.length; i++) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitus) {
        int pienin = taulukko[aloitus];
        int indeksi = aloitus;
        for (int i = aloitus; i < taulukko.length; i++) {
            if (pienin > taulukko[i]) {
                pienin = taulukko[i];
                indeksi = i;
            }
        }
        return indeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int apu = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = apu;
    }

    public static void jarjesta(int[] taulukko) {        
        for (int i = 0; i < taulukko.length; i++) {
            int pieninIndeksi = pienimmanIndeksiAlkaen(taulukko, i);
            if (taulukko[pieninIndeksi] < taulukko[i]) {
                vaihda(taulukko, i, pieninIndeksi);
            }
            System.out.println(Arrays.toString(taulukko));
        }
    }
}
