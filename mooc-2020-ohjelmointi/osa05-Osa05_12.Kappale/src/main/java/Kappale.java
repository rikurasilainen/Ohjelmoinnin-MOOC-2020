
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }
    
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }
        
        if (!(verrattava instanceof Kappale)) {
            return false;
        }
        
        Kappale v = (Kappale) verrattava;
        
        return (this.esittaja.equals(v.esittaja)
                && this.nimi.equals(v.nimi)
                && this.pituusSekunteina == v.pituusSekunteina);
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}
