
import java.util.ArrayList;


public class Tehtavienhallinta {
    private ArrayList<Tehtava> tehtavat;

    public Tehtavienhallinta() {
        this.tehtavat = new ArrayList<>();
    }
    
    public ArrayList<String> tehtavalista() {
        ArrayList<String> palautettavat = new ArrayList<>();
        for (Tehtava t: tehtavat) {
            palautettavat.add(t.getNimi());
        }
        return palautettavat;
    }
    
    public void lisaa(String tehtava) {
        this.tehtavat.add(new Tehtava(tehtava));
    }
    
    public void merkkaaTehdyksi(String tehtava) {
        for (Tehtava t: tehtavat) {
            if (t.getNimi().equals(tehtava)) {
                t.setTehty(true);
            }
        }
    }
    
    public boolean onTehty(String tehtava) {
        for (Tehtava t: tehtavat) {
            if (t.getNimi().equals(tehtava)) {
                return t.Ontehty();
            }
        }
        return false;
    }
    
}
