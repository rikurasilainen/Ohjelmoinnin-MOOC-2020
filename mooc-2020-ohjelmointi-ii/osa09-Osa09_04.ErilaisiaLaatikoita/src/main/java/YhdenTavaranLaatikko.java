
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
public class YhdenTavaranLaatikko extends Laatikko {
    private ArrayList<Tavara> laatikko;
    
    public YhdenTavaranLaatikko() {
        this.laatikko = new ArrayList();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (laatikko.isEmpty()) {
            laatikko.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return laatikko.contains(tavara);
    }
}
