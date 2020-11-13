
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
public class Resepti {
    private int keittoAika;
    private String nimi;
    private ArrayList<String> raakaAineet;
    
    public Resepti(String nimi, int keittoAika) {
        this.nimi = nimi;
        this.keittoAika = keittoAika;
        this.raakaAineet = new ArrayList<>();
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public int getKeittoAika() {
        return this.keittoAika;
    }
    
    public void lisaaRaakaAine(String aine) {
        this.raakaAineet.add(aine);
    }
    
    public boolean loytyykoRaakaAine(String haku) {
        for (String aine: this.raakaAineet) 
            if (aine.equals(haku)) {
                return true;
            }
        return false;
    }
    
    
    @Override
    public String toString() {
        String teksti = this.nimi + ", keittoaika: " + this.keittoAika;
        for (String raakaAine: this.raakaAineet) {
            teksti += "\n " + raakaAine;
        }
        return teksti;
    }
}
