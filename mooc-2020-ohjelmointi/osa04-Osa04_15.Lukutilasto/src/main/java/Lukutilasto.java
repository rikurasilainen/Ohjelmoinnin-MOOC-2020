
public class Lukutilasto {
    private int lukujenMaara;
    private int lukujenSumma;
    
    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.lukujenSumma = 0;
    }
    
    public void lisaaLuku(int luku) {
        this.lukujenMaara++;
        this.lukujenSumma += luku;
    }
    
    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    public int summa() {
        return this.lukujenSumma;
    }
    
    public double keskiarvo() {
        if (lukujenSumma == 0) {
            return 0;
        }
        return 1.0 * this.lukujenSumma / this.lukujenMaara;
    }
    
}
