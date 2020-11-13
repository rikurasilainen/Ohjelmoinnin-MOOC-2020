/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Mittari {
    private int mitta;
    
    public void lisaa() {
        if (mitta < 5) {
            mitta++;
        }
    }
    
    public void vahenna() {
        if (mitta != 0) {
            mitta--;
        }
    }
    
    public int mitta() {
        return mitta;
    }
    
    public boolean taynna() {
        return mitta == 5;
    }
    
}
