/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Esine {
    private String nimi;
    private String tunnus;
    
    public Esine(String tunnus, String nimi) {
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getTunnus() {
        return this.tunnus;
    }
    
    @Override
    public boolean equals(Object verrattava) {
        Esine v = (Esine) verrattava;
        return (tunnus.equals(v.tunnus));
    }
    
}
