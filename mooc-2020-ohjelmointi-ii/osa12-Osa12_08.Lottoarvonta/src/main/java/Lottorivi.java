
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;
    private Random r = new Random();

    public Lottorivi() {
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        this.numerot = new ArrayList<>();
        while (this.numerot.size() < 7) {
            int numero = r.nextInt(40) + 1;
            if (!sisaltaaNumeron(numero)) {
                this.numerot.add(numero);
            }
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        return numerot.contains(numero);
    }
}
