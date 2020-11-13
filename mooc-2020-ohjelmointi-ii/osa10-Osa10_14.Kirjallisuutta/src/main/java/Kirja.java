/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Kirja implements Comparable<Kirja> {
    private String nimi;
    private int ika;
    
    public Kirja(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getIka() {
        return this.ika;
    }
    
    @Override
    public int compareTo(Kirja o) {
        if (this.ika == o.ika) {
            return this.nimi.compareTo(o.nimi);
        }
        return this.ika - o.ika;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.ika + " vuotiaille ja vanhemmille)";
    }
    
    
}
