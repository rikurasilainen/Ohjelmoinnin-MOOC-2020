
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }
    
    public void lisaaAteria(String ateria) {
        if (!ateriat.contains(ateria)) {
            ateriat.add(ateria);
        }
    }
    
    public void tulostaAteriat() {
        ateriat.forEach((a) -> {
            System.out.println(a);
        });
    }
    
    public void tyhjennaRuokalista() {
        ateriat.clear();
    }

    // toteuta tänne tarvittavat metodit
}
