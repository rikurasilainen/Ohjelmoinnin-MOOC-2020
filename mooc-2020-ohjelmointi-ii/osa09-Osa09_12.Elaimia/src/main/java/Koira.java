/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Koira extends Elain implements Aanteleva {    
    public Koira(String nimi) {
        super(nimi);
    }
    
    public Koira() {
        super("Koira");
    }
    
    public void hauku() {
        System.out.println(getNimi() + " haukkuu");
    }

    @Override
    public void aantele() {
        this.hauku();
    }
    
}
