
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili tili = new Tili("Matin tili", 1000.0);
        Tili oma = new Tili("Oma tili", 0);
        tili.otto(100.00);
        oma.pano(100.00);
        System.out.println(tili);
        System.out.println(oma);
        
    }
}
