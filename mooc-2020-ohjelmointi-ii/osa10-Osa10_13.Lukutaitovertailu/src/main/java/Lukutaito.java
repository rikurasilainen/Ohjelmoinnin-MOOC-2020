/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class Lukutaito {

    private String sukupuoli;
    private String valtio;
    private int vuosi;
    private double prosentti;

    public Lukutaito(String sukupuoli, String valtio, int vuosi, double prosentti) {
        this.prosentti = prosentti;
        this.sukupuoli = sukupuoli;
        this.valtio = valtio;
        this.vuosi = vuosi;
    }

    public double getProsentti() {
        return this.prosentti;
    }

    @Override
    public String toString() {
        return this.valtio + " (" + this.vuosi + "), "
                + this.sukupuoli + ", " + this.prosentti;
    }

}
