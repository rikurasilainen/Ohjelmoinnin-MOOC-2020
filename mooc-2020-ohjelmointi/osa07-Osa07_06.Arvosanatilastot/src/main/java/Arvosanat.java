
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
public class Arvosanat {

    private ArrayList<Integer> pisteet;

    public Arvosanat() {
        this.pisteet = new ArrayList<>();
    }

    public void tuloste() {
        //kaiken tulostus tänne
        System.out.println("Pisteiden keskiarvo (kaikki): " + laskeKeskiarvo());
        int hyvaksytytPisteet = 0;
        int hyvaksytyt = 0;

        for (int i : this.pisteet) {
            if (i >= 50) {
                hyvaksytytPisteet += i;
                hyvaksytyt++;
            }
        }
        if (hyvaksytyt == 0) {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): -");
        } else {
            System.out.println("Pisteiden keskiarvo (hyväksytyt): " + 1.0 * hyvaksytytPisteet / hyvaksytyt);
        }
        System.out.println("Hyväksymisprosentti: " + 100.0 * hyvaksytyt / this.pisteet.size());

        System.out.println("Arvosanajakauma:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + tahtienTulostus(i));
        }

    }

    public void lisaaPisteet(int pistemaara) {
        if (pistemaara >= 0 && pistemaara <= 100) {
            this.pisteet.add(pistemaara);
        }
    }

    private double laskeKeskiarvo() {
        double summa = 0;
        for (int piste : this.pisteet) {
            summa += piste;
        }
        return summa / (1.0 * this.pisteet.size());
    }

    private String tahtienTulostus(int arvosana) {
        int montakotahtea = 0;
        for (Integer piste : pisteet) {
            if (laskeArvosana(piste) == arvosana) {
                montakotahtea++;

            }

        }

        return tahtia(montakotahtea);

    }

    private String tahtia(int n) {
        String tahdet = "";
        for (int i = 0; i < n; i++) {
            tahdet += "*";
        }
        return tahdet;
    }

    private int laskeArvosana(int pistemaara) {
        int numero = 5;
        if (pistemaara < 50) {
            numero = 0;
        } else if (pistemaara < 60) {
            numero = 1;
        } else if (pistemaara < 70) {
            numero = 2;
        } else if (pistemaara < 80) {
            numero = 3;
        } else if (pistemaara < 90) {
            numero = 4;
        }
        return numero;
    }
}
