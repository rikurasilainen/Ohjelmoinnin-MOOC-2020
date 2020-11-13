
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Varasto {
    private Map<String, Integer> varasto;
    private Map<String, Integer> saldot;
    
    public Varasto() {
        this.varasto = new HashMap();
        this.saldot = new HashMap();
    }
    
    public int saldo(String tuote) {
        if (!(this.saldot.containsKey(tuote))) {
            return 0;
        }
        return this.saldot.get(tuote);
    }
    
    public boolean ota(String tuote) {
        if (!(this.saldot.containsKey(tuote))) {
            return false;
        }
        
        int saldo = this.saldot.get(tuote);
        
        if (saldo == 0) {
            return false;
        }
        this.saldot.put(tuote, saldo - 1);
        return true;
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.varasto.put(tuote, hinta);
        this.saldot.put(tuote, saldo);
    }
    
    public int hinta(String tuote) {
        if (!varasto.containsKey(tuote)) {
            return -99;
        }
        return varasto.get(tuote);
    }
    
    public Set<String> tuotteet() {
        return this.varasto.keySet();
    }
    
}
