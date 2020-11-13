
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
public class Putki<T> {
    private List<T> t;
    
    public Putki() {
        t = new ArrayList();
    }
    
    public void lisaaPutkeen(T arvo) {
        t.add(arvo);
    }
    
    public T otaPutkesta() {
        if (onkoPutkessa()) {
            T otettava = t.get(0);
            t.remove(otettava);
            return otettava;
        }
        return null;
    }
    
    public boolean onkoPutkessa() {
        return !t.isEmpty();
    }
    
}
