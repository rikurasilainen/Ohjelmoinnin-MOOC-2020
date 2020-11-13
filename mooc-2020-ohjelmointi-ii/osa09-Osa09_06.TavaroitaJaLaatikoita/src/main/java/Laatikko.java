
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
public class Laatikko implements Talletettava {

    private ArrayList<Talletettava> laatikko;
    private double maksimi;

    public Laatikko(double maksimiPaino) {
        this.laatikko = new ArrayList();
        this.maksimi = maksimiPaino;
    }

    public void lisaa(Talletettava t) {
        if (this.paino() + t.paino() <= maksimi) {
            this.laatikko.add(t);
        }
    }

    public double paino() {
        double paino = 0;
        for (Talletettava t : laatikko) {
            paino += t.paino();
        }
        return paino;
    }

    @Override
    public String toString() {
        return "Laatikko: " + this.laatikko.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
}
