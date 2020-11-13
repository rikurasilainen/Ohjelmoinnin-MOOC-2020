
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        ArrayList<Integer> lista = new ArrayList();
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 9999) {
                break;
            }
            lista.add(luku);
        }
        
        int pienin = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (pienin > lista.get(i)) {
                pienin = lista.get(i);
            }
        }
        System.out.println("Pienin luku on " + pienin);
        
        for (int i = 0; i < lista.size(); i++) {
            if (pienin == lista.get(i)) {
                System.out.println("Pienin luku löytyy indeksistä " + i);
            }
        }
        
        
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
    }
}
