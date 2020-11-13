
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Ostoskori {
    private Map<String, Ostos> kori;
    
    public Ostoskori() {
        this.kori = new HashMap();
    }
    
    public void lisaa(String tuote, int hinta) {
        this.kori.putIfAbsent(tuote, new Ostos(tuote, 0, hinta));
        this.kori.get(tuote).kasvataMaaraa();
    }
    
    public int hinta() {
        int hinta = 0;
        for (Ostos o: kori.values()) {
            hinta += o.hinta();
        }
        return hinta;
    }
    public void tulosta() {
        for (Ostos o: kori.values()) {
            System.out.println(o);
        }
    }

}
