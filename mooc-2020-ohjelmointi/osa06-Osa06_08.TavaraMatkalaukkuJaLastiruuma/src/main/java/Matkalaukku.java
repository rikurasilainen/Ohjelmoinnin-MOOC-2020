
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
public class Matkalaukku {
    private ArrayList<Tavara> laukku;
    private int maksimi;
    
    public Matkalaukku(int maksimi) {
        this.maksimi = maksimi;
        this.laukku = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara) {
        int yht = 0;
        for (Tavara t: laukku) {
            yht += t.getPaino();
        }
        if (yht + tavara.getPaino() <= maksimi) {
            laukku.add(tavara);
        }
    }
    
    public void tulostaTavarat() {
        for (Tavara t: laukku) {
            System.out.println(t.toString());
        }
    }
    
    public int yhteispaino() {
        int yhteispaino = 0;
        for (Tavara t: laukku) {
            yhteispaino += t.getPaino();
        }
        return yhteispaino;
    }
    
    public Tavara raskainTavara() {
        if (this.laukku.isEmpty()) {
            return null;
        }
        Tavara raskain = this.laukku.get(0);
        for (Tavara t: laukku) {
            if (t.getPaino() > raskain.getPaino()) {
                raskain = t;
            }
        }
        return raskain;
    }
    
    @Override
    public String toString() { 
        if (this.laukku.size() == 1) {
            return "1 tavara (" + yhteispaino() + " kg)";
        } else if (this.laukku.isEmpty()) {
            return "ei tavaroita (0 kg)";
        }    
        return this.laukku.size() + " tavaraa (" + yhteispaino() + " kg)";
    }
    
}
