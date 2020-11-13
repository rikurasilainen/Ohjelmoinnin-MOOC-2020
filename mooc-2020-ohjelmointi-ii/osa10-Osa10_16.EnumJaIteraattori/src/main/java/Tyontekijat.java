
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Vapa MkIV
 */
public class Tyontekijat {

    private List<Henkilo> tekijat;

    public Tyontekijat() {
        this.tekijat = new ArrayList();
    }

    public void lisaa(Henkilo lisattava) {
        this.tekijat.add(lisattava);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        lisattavat.forEach(h -> {
            this.tekijat.add(h);
        });
    }

    public void tulosta() {
        Iterator<Henkilo> i = this.tekijat.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> i = this.tekijat.iterator();
        while (i.hasNext()) {
            Henkilo h = i.next();
            if (h.getKoulutus().equals(koulutus)) {
                System.out.println(h);
            }
        }
    }

    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> i = this.tekijat.iterator();
        while (i.hasNext()) {
            if (i.next().getKoulutus().equals(koulutus)) {
                i.remove();
            }
        }
    }
}
