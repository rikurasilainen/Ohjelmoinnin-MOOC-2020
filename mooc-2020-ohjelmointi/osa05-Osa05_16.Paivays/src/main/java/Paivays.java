
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }
    
    public Paivays paivienPaasta(int paivia) {
        Paivays uusi = new Paivays(this.paiva, this.kuukausi, this.vuosi);
        uusi.etene(paivia);
        return uusi;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }
    
    public void etene(){
        this.paiva++;
        if (this.paiva > 30) {
            this.paiva = 1;
            this.kuukausi++;
            if (this.kuukausi > 12) {
                this.kuukausi = 1;
                this.vuosi++;
            }
        }
    }
    
    public void etene(int montakoPaivaa) {
        while (montakoPaivaa > 0) {
            etene();
            montakoPaivaa--;
        }
    }
    
    

}
