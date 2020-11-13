/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logiikka;

import mooc.ui.Kayttoliittyma;

/**
 *
 * @author Vapa MkIV
 */
public class Sovelluslogiikka {
    private Kayttoliittyma kayttoliittyma;
    
    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma) {
        this.kayttoliittyma = kayttoliittyma;
    }
    
    public void suorita(int montaKertaa) {
        int monta = montaKertaa;
        while (monta > 0) {
            monta--;
            System.out.println("Sovelluslogiikka toimii");
            kayttoliittyma.paivita();
        }
    }
    
}
