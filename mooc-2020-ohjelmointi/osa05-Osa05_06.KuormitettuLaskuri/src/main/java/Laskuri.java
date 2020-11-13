/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Laskuri {
    private int arvo;
    
    public Laskuri(int alkuarvo) {
        this.arvo = alkuarvo;
    }
    
    public Laskuri() {
        this.arvo = 0;
    }
    
    public int arvo() {
        return this.arvo;
    }
    
    public void lisaa(int lisays) {
        if (lisays > -1) {
            this.arvo += lisays;
        }
    }
    
    public void lisaa() {
        this.arvo++;
    }
    
    public void vahenna(int vahennys) {
        if (vahennys > -1) {
            this.arvo -= vahennys;
        }
    }
    
    public void vahenna() {
        this.arvo--;
    }      
}
