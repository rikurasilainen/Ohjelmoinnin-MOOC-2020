
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> arvosanapisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.arvosanapisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
        this.arvosanapisteet.add(pisteet);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }
    
    public double koepisteidenKeskiarvo() {
        if (this.arvosanapisteet.isEmpty()) {
            return -1;
        }
        int summa = 0;
        for (int i = 0; i < this.arvosanapisteet.size(); i++) {
            summa += this.arvosanapisteet.get(i);
        }
        return 1.0 * summa / this.arvosanapisteet.size();
        
    }
    
    public double arvosanojenKeskiarvo() {
        if (this.arvosanat.isEmpty()) {
            return -1;
        }
        double summa = 0;
        for (int i = 0; i < this.arvosanat.size(); i++) {
            summa += this.arvosanat.get(i);
        }   
        return summa / this.arvosanat.size();
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
}
