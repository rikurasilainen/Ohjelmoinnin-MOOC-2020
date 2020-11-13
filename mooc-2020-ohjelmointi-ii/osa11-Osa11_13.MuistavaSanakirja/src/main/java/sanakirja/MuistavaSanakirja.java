/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;
import java.util.*;
import java.io.*;

/**
 *
 * @author Vapa MkIV
 */
public class MuistavaSanakirja {
    private HashMap<String, String> sanakirja;
    private String tiedostoSijainti;
    public MuistavaSanakirja() {
        this.sanakirja = new HashMap<>();
    }
    public MuistavaSanakirja(String tiedosto) {
        this.tiedostoSijainti = tiedosto;
        this.sanakirja = new HashMap<>();
    }
    public boolean lataa() {
        Scanner lukija;
        try {
            lukija = new Scanner(new File(this.tiedostoSijainti));
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löydy");
            return false;
        }
        this.sanakirja = new HashMap<>();
        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();
            String[] osat = rivi.split(":");
            lisaa(osat[0], osat[1]);
        }
        return true;
    }
    public void lisaa(String sana, String kaannos) {
        if (!this.sanakirja.containsKey(sana) && !this.sanakirja.containsValue(sana)) {
            this.sanakirja.put(sana, kaannos);
        }
    }
    public String kaanna(String sana) {
        if (this.sanakirja.isEmpty()) {
            return null;
        }
        if (this.sanakirja.containsKey(sana)) {
            return this.sanakirja.get(sana);
        } else if (this.sanakirja.containsValue(sana)) {
            for (String a : this.sanakirja.keySet()) {
                if (this.sanakirja.get(a).equals(sana)) {
                    return a;
                }
            }
        }
        return null;
    }
    public void poista(String sana) {
        if (sanakirja.containsKey(sana)) {
            sanakirja.remove(sana);
        } else if (sanakirja.containsValue(sana)) {
            for (String avain : this.sanakirja.keySet()) {
                if (this.sanakirja.get(avain).equals(sana)) {
                    sanakirja.remove(avain);
                    break;
                }
            }
        }
    }

    public boolean tallenna() {
        FileWriter kirjoita;
        try {
            kirjoita = new FileWriter(tiedostoSijainti);
            for (String rivi : this.sanakirja.keySet()) {
                kirjoita.write(rivi + ":" + this.sanakirja.get(rivi) + "\n");
            }
            kirjoita.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
