
public class Main {

    public static void main(String[] args) {
        // Kokeile luokkaasi täällä
        Huone huone = new Huone();
        System.out.println("Huone tyhjä? " + huone.onTyhja());
        huone.lisaa(new Henkilo("Lea", 183));
        huone.lisaa(new Henkilo("Kenya", 182));
        huone.lisaa(new Henkilo("Auli", 186));
        huone.lisaa(new Henkilo("Nina", 172));
        huone.lisaa(new Henkilo("Terhi", 185));
        System.out.println("Huone tyhjä? " + huone.onTyhja());

        System.out.println("");
        for (Henkilo henkilo : huone.getHenkilot()) {
            System.out.println(henkilo);
        }

    }
}
