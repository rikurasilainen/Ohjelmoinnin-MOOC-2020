/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Kirja {
    private String nimi;
    private int sivuja;
    private int julkaisuvuosi;
    
    public Kirja(String nimi, int sivuja, int julkaisuvuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.julkaisuvuosi = julkaisuvuosi;
    }
    
    public String nimi() {
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return this.nimi + ", " + this.sivuja + " sivua, " + this.julkaisuvuosi;
    }
    
}
