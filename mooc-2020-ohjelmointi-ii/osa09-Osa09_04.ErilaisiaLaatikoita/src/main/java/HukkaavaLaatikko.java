
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
public class HukkaavaLaatikko extends Laatikko {
    private ArrayList<Tavara> laatikko;
    
    public HukkaavaLaatikko() {
        this.laatikko = new ArrayList();
    }

    @Override
    public void lisaa(Tavara tavara) {
        this.laatikko.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        this.laatikko.remove(tavara);
        return laatikko.contains(tavara);
    }
}
