/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

import java.util.*;

/**
 *
 * @author Vapa MkIV
 */
public class Keskiarvosensori implements Sensori {

    private ArrayList<Sensori> sensorit;
    private ArrayList<Integer> mittaukset;

    public Keskiarvosensori() {
        this.sensorit = new ArrayList<>();
        this.mittaukset = new ArrayList<>();
    }

    @Override
    public boolean onPaalla() {
        boolean onkoPaalla = true;
        for (Sensori sensori : sensorit) {
            if (!(sensori.onPaalla())) {
                onkoPaalla = false;
            }
        }
        return onkoPaalla;
    }

    @Override
    public void paalle() {
        sensorit.forEach((sensori) -> {
            sensori.paalle();
        });
    }

    @Override
    public void poisPaalta() {
        sensorit.forEach((sensori) -> {
            sensori.poisPaalta();
        });
    }

    @Override
    public int mittaa() {
        boolean paalla = false;
        for (Sensori sensori : sensorit) {
            paalla = sensori.onPaalla();
        }
        if (paalla = false || sensorit.isEmpty()) {
            throw new IllegalStateException();
        }
        int summa = 0;
        for (Sensori sensori : sensorit) {
            summa = summa + sensori.mittaa();
        }
        int mittaus = summa / sensorit.size();
        mittaukset.add(mittaus);
        return mittaus;
    }

    public void lisaaSensori(Sensori lisattava) {
        this.sensorit.add(lisattava);
    }

    public List<Integer> mittaukset() {
        return mittaukset;
    }
}
