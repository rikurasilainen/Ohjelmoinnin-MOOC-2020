/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Sekuntikello {
    private Viisari sadasosat;
    private Viisari sekunnit;
    
    public Sekuntikello() {
        this.sadasosat = new Viisari(100);
        this.sekunnit = new Viisari(60);
    }
    
    public void etene() {
        this.sadasosat.etene();
        if (this.sadasosat.arvo() == 0) {
            this.sekunnit.etene();
            }
    }
    
    
    @Override
    public String toString() {
        return sekunnit + ":" + sadasosat;
    }
}
