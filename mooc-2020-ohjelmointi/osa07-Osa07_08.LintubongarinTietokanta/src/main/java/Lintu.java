/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Lintu {
    private String nimi;
    private String latina;
    private int havainnot;
    
    public Lintu(String nimi, String latina) {
        this.nimi = nimi;
        this.latina = latina;
        this.havainnot = 0;
    }
    
    public void lisaaHavainto() {
        this.havainnot++;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return this.nimi + " (" + this.latina + "): " + this.havainnot + " havaintoa";
    }
}
