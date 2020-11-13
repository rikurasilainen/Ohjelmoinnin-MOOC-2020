
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
public class Huone {
    private ArrayList<Henkilo> henkilot;
    
    public Huone() {
        this.henkilot = new ArrayList<>();
    }
    
    public void lisaa(Henkilo henkilo) {
        this.henkilot.add(henkilo);
    }
    
    public boolean onTyhja() {
        return this.henkilot.isEmpty();
    }
    
    public ArrayList<Henkilo> getHenkilot() {
        return this.henkilot;
    }
    
    public Henkilo lyhin() {
        Henkilo lyhin = new Henkilo("", 1000);
        if (this.henkilot.isEmpty()) {
            return null;
        }
        for (Henkilo h: henkilot) {
            if (h.getPituus() < lyhin.getPituus()) {
                lyhin = h;
            }
        }
        return lyhin;
    }
    
    public Henkilo ota() {
       if (this.henkilot.isEmpty()) {
           return null;
       }
       Henkilo lyhin = new Henkilo("", 1000);
        if (this.henkilot.isEmpty()) {
            return null;
        }
        for (Henkilo h: henkilot) {
            if (h.getPituus() < lyhin.getPituus()) {
                lyhin = h;
            }
        }
        this.henkilot.remove(lyhin);
        return lyhin;
    }
    
}
