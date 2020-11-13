
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
public class Tehtavalista {
    private ArrayList<String> tehtavat;
    
    public Tehtavalista() {
        this.tehtavat = new ArrayList<>();
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(tehtava);
    }
    
    public void tulosta() {
        int indeksi = 0;
        for (String t: tehtavat) {
            indeksi++;
            System.out.println(indeksi + ": " + t);
        }
    }
    
    public void poista(int numero) {
        this.tehtavat.remove(numero - 1);
    }
}
