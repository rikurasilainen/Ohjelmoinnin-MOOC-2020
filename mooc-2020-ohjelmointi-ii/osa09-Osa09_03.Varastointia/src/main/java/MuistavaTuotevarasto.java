/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vapa MkIV
 */
public class MuistavaTuotevarasto extends Tuotevarasto {
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        muutoshistoria = new Muutoshistoria();
        lisaaVarastoon(alkuSaldo);
    }
    
    @Override
    public void lisaaVarastoon(double maara) {
        super.lisaaVarastoon(maara);
        muutoshistoria.lisaa(getSaldo());
    }
    
    @Override
    public double otaVarastosta(double maara) {
        double otettava = super.otaVarastosta(maara);
        muutoshistoria.lisaa(getSaldo());
        return otettava;
    }
    
    public String historia() {
        return this.muutoshistoria.toString();
    }
    
    public void tulostaAnalyysi() {
        System.out.println("Tuote: " + this.getNimi());
        System.out.println("Historia: " + muutoshistoria);
        System.out.println("Suurin tuotemäärä: " + this.muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + this.muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + this.muutoshistoria.keskiarvo());
    }
    
}
