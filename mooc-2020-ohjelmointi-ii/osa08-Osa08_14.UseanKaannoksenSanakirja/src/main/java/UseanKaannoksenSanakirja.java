
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList> sanakirja;
    
    public UseanKaannoksenSanakirja() {
        this.sanakirja = new HashMap<>();
    }
    
    public void lisaa(String sana, String kaannos) {
        this.sanakirja.putIfAbsent(sana, new ArrayList<>());
        this.sanakirja.get(sana).add(kaannos);
    }
    
    public ArrayList<String> kaanna(String sana) {
        return this.sanakirja.getOrDefault(sana, new ArrayList<>());
    }
    
    public void poista(String sana) {
        if (this.sanakirja.containsKey(sana)) {
            this.sanakirja.remove(sana);
        }
    }
    
}
