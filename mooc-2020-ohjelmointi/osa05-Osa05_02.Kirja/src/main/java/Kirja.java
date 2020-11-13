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
    private String kirjailija;
    private String nimi;
    private int sivuja;
    
    public Kirja(String kirjailija, String nimi, int sivuja) {
        this.kirjailija = kirjailija;
        this.sivuja = sivuja;
        this.nimi = nimi;
    }
    
    @Override
    public String toString() {
        return this.kirjailija + ", " + this.nimi + ", " + this.sivuja + " sivua";
    }
    
    public String getKirjailija() {
        return this.kirjailija;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getSivuja() {
        return this.sivuja;
    }
    
    
}
