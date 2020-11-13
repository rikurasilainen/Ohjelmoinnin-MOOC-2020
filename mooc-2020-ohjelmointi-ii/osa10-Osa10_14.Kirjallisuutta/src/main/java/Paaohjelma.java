
import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> lista = new ArrayList();
        while (true) {
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa: ");
            String syote = lukija.nextLine();
            if (syote.isEmpty()) {
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            lista.add(new Kirja(syote, ika));
        }
        System.out.println("");
        System.out.println("Yhteensä " + lista.size() + " kirjaa.");
        System.out.println("");
        System.out.println("Kirjat:");
        lista.stream().sorted().forEach(k -> {
            System.out.println(k);
        });
    }
}
