
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
public class Lyhenteet {
    private HashMap<String, String> lyhenteet;
    
    public Lyhenteet() {
        this.lyhenteet = new HashMap();
    }
    
    public void lisaaLyhenne(String lyhenne, String selite) {
        this.lyhenteet.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        return this.lyhenteet.containsKey(lyhenne);
    } 
    
    public String haeLyhenne(String lyhenne) {
        if (onkoLyhennetta(lyhenne)) {
            return this.lyhenteet.get(lyhenne);
        } else {
            return null;
        }
    }
    
}
