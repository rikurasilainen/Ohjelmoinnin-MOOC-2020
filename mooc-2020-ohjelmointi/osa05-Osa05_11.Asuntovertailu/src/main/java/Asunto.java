
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        return verrattava.nelioita < this.nelioita;
    }
    
    public int hintaero(Asunto verrattava) {
        int verrattavaHinta = verrattava.nelioita * verrattava.neliohinta;
        int hinta = this.neliohinta * this.nelioita;
        
        if (hinta > verrattavaHinta) {
            return hinta - verrattavaHinta;
        } else {
            return verrattavaHinta - hinta;
        }
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        int verrattavaHinta = verrattava.nelioita * verrattava.neliohinta;
        int hinta = this.neliohinta * this.nelioita;
        return verrattavaHinta < hinta;
        
    }

}
