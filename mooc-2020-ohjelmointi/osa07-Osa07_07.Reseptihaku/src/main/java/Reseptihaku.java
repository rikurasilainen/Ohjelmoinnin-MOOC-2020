
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Resepti> reseptit = new ArrayList();

        System.out.println("Mistä luetaan?");
        String syote = lukija.nextLine();
        try (Scanner tiedostonLukija = new Scanner(new File(syote))) {
            while (tiedostonLukija.hasNextLine()) {
                String nimi = tiedostonLukija.nextLine();
                int keittoaika = Integer.parseInt(tiedostonLukija.nextLine());
                Resepti resepti = new Resepti(nimi, keittoaika);
                reseptit.add(resepti);
                while (tiedostonLukija.hasNextLine()) {
                    String raakaAine = tiedostonLukija.nextLine();
                    if (raakaAine.isEmpty()) {
                        break;
                    }
                    resepti.lisaaRaakaAine(raakaAine);
                }
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

        System.out.println("\nKomennot:\nlistaa - listaa reseptit\nlopeta - lopettaa ohjelman");
        System.out.println("hae nimi - hakee reseptiä nimen perusteella");
        System.out.println("hae keittoaika - hakee reseptiä keittoajan perusteella");
        System.out.println("hae aine - hakee reseptiä raaka-aineen perusteella\n");

        OUTER:
        while (true) {
            System.out.println("Syötä komento: ");
            String komento = lukija.nextLine();
            switch (komento) {
                case "lopeta":
                    break OUTER;
                case "listaa":
                    System.out.println("\nReseptit:");
                    for (Resepti resepti : reseptit) {
                        System.out.println(resepti);
                    }
                    break;
                case "hae nimi":
                    System.out.println("Mitä haetaan: ");
                    String haku = lukija.nextLine();
                    System.out.println("Reseptit: ");
                    for (Resepti resepti : reseptit) {
                        if (resepti.getNimi().toLowerCase().contains(haku.toLowerCase())) {
                            System.out.println(resepti + "\n");
                        }
                    }

                    break;
                case "hae keittoaika":
                    System.out.println("Keittoaika korkeintaan: ");
                    int max = Integer.parseInt(lukija.nextLine());
                    System.out.println("");
                    for (Resepti resepti : reseptit) {
                        if (resepti.getKeittoAika() <= max) {
                            System.out.println(resepti + "\n");
                        }
                    }
                    break;
                case "hae aine":
                    System.out.println("Mitä raaka-ainetta haetaan: ");
                    System.out.println("");
                    String haettava = lukija.nextLine().toLowerCase();
                    for (Resepti resepti : reseptit) {
                        if (resepti.loytyykoRaakaAine(haettava)) {
                            System.out.println(resepti);
                        }
                    }
                    break;
            }
        }
    }
}
