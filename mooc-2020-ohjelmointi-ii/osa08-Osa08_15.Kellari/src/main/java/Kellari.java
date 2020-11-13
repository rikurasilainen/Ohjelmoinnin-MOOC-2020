
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
public class Kellari {

    private HashMap<String, ArrayList> kellari;

    public Kellari() {
        this.kellari = new HashMap();
    }

    public void lisaa(String komero, String tavara) {
        this.kellari.putIfAbsent(komero, new ArrayList<>());
        this.kellari.get(komero).add(tavara);
    }

    public ArrayList<String> sisalto(String komero) {
        return this.kellari.getOrDefault(komero, new ArrayList<>());
    }

    public void poista(String komero, String tavara) {
        if (!this.kellari.containsKey(komero)) {
            return;
        }
        this.kellari.get(komero).remove(tavara);
        if (this.kellari.get(komero).isEmpty()) {
            this.kellari.remove(komero);
        }
        
    }

    public ArrayList<String> komerot() {
        ArrayList<String> komerot = new ArrayList();
        for (String komero : kellari.keySet()) {
            if (!kellari.isEmpty()) {
                komerot.add(komero);
            }
        }
        return komerot;
    }
}
