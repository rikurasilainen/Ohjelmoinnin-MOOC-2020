/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Ottelu {
    private String kotijoukkue;
    private String vierasjoukkue;
    private Integer kotipisteet;
    private Integer vieraspisteet;
    
    public Ottelu(String kotijoukkue, String vierasjoukkue, int kotipisteet, int vieraspisteet) {
        this.kotijoukkue = kotijoukkue;
        this.vierasjoukkue = vierasjoukkue;
        this.kotipisteet = kotipisteet;
        this.vieraspisteet = vieraspisteet;       
    }
    public String getKoti() {
        return this.kotijoukkue;
    }
    
    public String getVieras() {
        return this.vierasjoukkue;
    }
    
    public boolean voitto() {
        return kotipisteet > vieraspisteet;
    }
    
    
}
