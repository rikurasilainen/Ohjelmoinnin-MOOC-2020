
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
    public class MaksimipainollinenLaatikko extends Laatikko {
        private int max;
        private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.max = maksimipaino;
        this.tavarat = new ArrayList();
    }

    @Override
    public void lisaa(Tavara tavara) {
        int summa = 0;
        for (Tavara t: tavarat) {
            summa += t.getPaino();
        }
        if (!(summa + tavara.getPaino() > this.max)) {
            tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return this.tavarat.contains(tavara);
    }
    
}
