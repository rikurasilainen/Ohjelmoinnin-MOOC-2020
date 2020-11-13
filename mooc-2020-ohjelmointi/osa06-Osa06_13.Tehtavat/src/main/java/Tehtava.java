/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Tehtava {
    private String nimi;
    private boolean tehty;
    
    public Tehtava(String nimi) {
        this.nimi = nimi;
        this.tehty = false;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void setTehty(boolean tehty) {
        this.tehty = tehty;
    }
    
    public boolean Ontehty() {
        return tehty;
    }
}
