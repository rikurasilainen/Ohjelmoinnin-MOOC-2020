/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Kuutio {
    private int sarma;
    
    public Kuutio(int sarmanPituus) {
        this.sarma = sarmanPituus;
    }
    
    public int tilavuus() {
        return sarma * sarma * sarma;
    }
    
    @Override
    public String toString() {
        return "Kuution särmän pituss on " + sarma + ", tilavuus on " + (sarma * sarma * sarma);
    }
    
}
