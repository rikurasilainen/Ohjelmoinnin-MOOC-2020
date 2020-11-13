
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
public class Lastiruuma {
    private int maksimi;
    private ArrayList<Matkalaukku> ruuma;
    
    public Lastiruuma(int maksimi) {
        this.maksimi = maksimi;
        this.ruuma = new ArrayList<>();
    }
    public void lisaaMatkalaukku(Matkalaukku laukku) {
       int ruumaPaino = 0;       
       for (Matkalaukku l: ruuma) {
           ruumaPaino += l.yhteispaino();
       }
       if (laukku.yhteispaino() + ruumaPaino <= maksimi) {
           ruuma.add(laukku);
       }  
    }
    
    @Override
    public String toString() {
        int yht = 0;
        for (Matkalaukku l: ruuma) {
            yht += l.yhteispaino();
        }
        
        return this.ruuma.size() + " matkalaukkua (" + yht + " kg)";
    }
    
    public void tulostaTavarat() {
        for (Matkalaukku l: ruuma) {
            l.tulostaTavarat();
        }
    }
    
}
