
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Lauma implements Siirrettava {
    private List<Siirrettava> lista;

    
    public Lauma() {
        this.lista = new ArrayList();
    }
    
    
    @Override
    public void siirra(int dx, int dy) {
        for (Siirrettava s: this.lista) {
            s.siirra(dx, dy);
        }
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lista.add(siirrettava);
    }
    
    @Override
    public String toString() {
        String tuloste = "";
        
        for (Siirrettava s: this.lista) {
           tuloste += s.toString() + "\n";
        }  
        return tuloste;
    }
    
}
