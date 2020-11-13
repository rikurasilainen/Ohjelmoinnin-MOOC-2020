
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
public class Pakka {
    private ArrayList<String> lista;
    
    public Pakka() {
        this.lista = new ArrayList<>();
    }
    
    
    public boolean onTyhja() {
        return lista.isEmpty();
    }
    
    public void lisaa(String arvo) {
        lista.add(arvo);
    }
    
    public ArrayList<String> arvot() {
        return lista;
    }
    
    public String ota() {
        String otettava = lista.get(lista.size() - 1);
        lista.remove(lista.size() - 1);
        return otettava;
    }
    
}
