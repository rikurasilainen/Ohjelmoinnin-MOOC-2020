
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }
    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa + lisattava.euroa, this.senttia + lisattava.senttia);    
        return uusi;
    }
    
    public boolean vahemman(Raha verrattava) {
        int verrattavaEuro = verrattava.eurot();
        int verrattavaSentti = verrattava.sentit();
        if (verrattavaEuro == eurot()) {
            return this.senttia < verrattavaSentti;
        } else if (verrattavaEuro > this.euroa) {
            return true;
        }
        
        return false;
    }
    
    public Raha miinus(Raha vahentaja) {
        int sentit = this.senttia - vahentaja.sentit();
        int eurot = this.euroa - vahentaja.eurot();
        
        if (sentit < 0) {
            sentit += 100;
            eurot--;
        }
        
        if (eurot < 0) {
            return new Raha(0, 0);
        }
        
        return new Raha(eurot, sentit);
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

}
