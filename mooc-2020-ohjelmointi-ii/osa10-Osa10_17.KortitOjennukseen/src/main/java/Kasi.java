
import java.util.ArrayList;
import java.util.Collections;
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
public class Kasi implements Comparable<Kasi> {
    private List<Kortti> kasi;
    
    public Kasi() {
        this.kasi = new ArrayList();
    }
    
    public void lisaa(Kortti kortti) {
        this.kasi.add(kortti);
    }
    
    public void tulosta() {
        kasi.stream().forEach(k -> System.out.print(k + "\n"));
    }
    
    public void jarjesta() {
        Collections.sort(kasi);
    }
    
    public void jarjestaMaittain() {
        Collections.sort(kasi, new SamatMaatVierekkainArvojarjestykseen());
    }
    
    private int arvojenSumma() {
        int summa = 0;
        for (Kortti k: kasi) {
            summa += k.getArvo();
        }
        return summa;
    }

    @Override
    public int compareTo(Kasi o) {
        return this.arvojenSumma() - o.arvojenSumma();
    }
    
    
    
}
