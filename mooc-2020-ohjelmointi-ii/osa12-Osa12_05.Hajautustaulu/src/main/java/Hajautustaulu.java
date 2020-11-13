/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
import java.util.*;

public class Hajautustaulu<K, V> {

    private ArrayList<Pari<K, V>> arvot;
    private int arvoja;

    public Hajautustaulu() {
        this.arvot = new ArrayList<>();
        this.arvoja = 0;
    }
    
    public void lisaa(K avain, V arvo) {
        int hajautusArvo = Math.abs(avain.hashCode() % (arvot.size() + 1));
        if (arvot.get(hajautusArvo) == null) {
            Pari<K, V> tempPari = new Pari<>(avain, arvo);
            arvot.add(hajautusArvo, tempPari);
        }
    }

    public V hae(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % (this.arvot.size() + 1));
        if (this.arvot.get(hajautusArvo) == null) {
            return null;
        } else {
            return this.arvot.get(hajautusArvo).getArvo();
        }
    }
}
