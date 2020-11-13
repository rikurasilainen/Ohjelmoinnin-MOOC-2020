
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
public class Tietokanta {
    private ArrayList<Lintu> linnut;
    
    public Tietokanta() {
        this.linnut = new ArrayList();
    }
    
    public void lisaaLintu(String lintu, String latina) {
        this.linnut.add(new Lintu(lintu, latina));
    }
    
    public String Nayta(String nimi) {
        for (Lintu lintu: linnut) {
            if (lintu.getNimi().equals(nimi)) {
                return lintu.toString();
            }
        }
        return null;
    }
    
    public String tilasto() {
        String jono = "";
        for (Lintu lintu: linnut) {
            jono += lintu.toString() + "\n";
        }
        return jono; 
    }
    public boolean havainto(String nimi) {
        for (Lintu lintu: linnut) {
            if (lintu.getNimi().equals(nimi)) {
                lintu.lisaaHavainto();
                return true;
            }
        }
        return false;
    }
}
