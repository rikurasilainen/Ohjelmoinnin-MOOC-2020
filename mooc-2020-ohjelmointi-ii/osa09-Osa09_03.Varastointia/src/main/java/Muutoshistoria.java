
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Muutoshistoria {
    private ArrayList<Double> muutoshistoria;
    
    public Muutoshistoria() {
        this.muutoshistoria = new ArrayList();
    }
    
    public void lisaa(double tilanne) {
        this.muutoshistoria.add(tilanne);
    }
    
    public void nollaa() {
        this.muutoshistoria.clear();
    }
    
    public double maxArvo() {
        double max = this.muutoshistoria.get(0);
        for (double d: this.muutoshistoria) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }
    
    public double minArvo() {
        double min = this.muutoshistoria.get(0);
        for (double m: this.muutoshistoria) {
            if (m < min) {
                min = m;
            }
        }
        return min;
    }
    
    public double keskiarvo() {
        double yhteensa = 0;
        for (double d: this.muutoshistoria) {
            yhteensa += d;
        }
        return yhteensa / this.muutoshistoria.size();
    }
    
    @Override
    public String toString() {
        return this.muutoshistoria.toString();
    }
}
