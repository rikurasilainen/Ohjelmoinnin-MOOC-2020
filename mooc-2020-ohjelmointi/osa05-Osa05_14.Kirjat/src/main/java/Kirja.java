
public class Kirja {

    private String nimi;
    private int julkaisuvuosi;

    public Kirja(String nimi, int julkaisuvuosi) {
        this.nimi = nimi;
        this.julkaisuvuosi = julkaisuvuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getJulkaisuvuosi() {
        return julkaisuvuosi;
    }
    
    @Override
    public boolean equals(Object verrattava) {
        Kirja k = (Kirja) verrattava;
        return (this.nimi.equals(k.nimi) && this.julkaisuvuosi == k.julkaisuvuosi);
    }
}
