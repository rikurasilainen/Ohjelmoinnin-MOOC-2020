
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        if (maksu >= 2.50) {
            double takaisin = maksu - 2.50;
            rahaa += 2.50;
            edulliset++;
            return takaisin;
        }
         return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        if (maksu >= 4.30) {
            double takaisin = maksu - 4.30;
            rahaa += 4.30;
            maukkaat++;
            return takaisin;
        }
         return maksu;
    }
    
    public boolean syoEdullisesti(Maksukortti kortti) {
        if (kortti.saldo() >= 2.50) {
            kortti.otaRahaa(2.50);
            edulliset++;
            return true;
        }
        return false;
    }
    
    public boolean syoMaukkaasti(Maksukortti kortti) {
        if (kortti.saldo() >= 4.30) {
            kortti.otaRahaa(4.30);
            maukkaat++;
            return true;
        }
        return false;
    }
    
    
    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            kortti.lataaRahaa(summa);
            rahaa += summa;
        }
    }



    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
