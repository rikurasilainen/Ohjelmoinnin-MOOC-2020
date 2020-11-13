
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    
    @Override
    public String toString() {
        if (alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";
        } else if (alkiot.size() == 1) {
            return "Joukossa " + this.nimi + " on 1 alkio:\n" + this.alkiot.get(0);
        } else {
            String alkiosisalto = "";
            for (String a: this.alkiot) {
                if (!(alkiosisalto.equals(this.alkiot.get(this.alkiot.size() - 1)))){
                    alkiosisalto += a + "\n";
                } else {
                    alkiosisalto += a;
                }
                
            }   
            return "Joukossa " + this.nimi + " on " + this.alkiot.size() + " alkiota:\n" + alkiosisalto;
        }
    }
    
}
