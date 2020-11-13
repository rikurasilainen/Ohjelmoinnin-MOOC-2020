
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        lista.lisaa("hei");
        lista.lisaa("maailma");

        for (int i = 0; i < lista.koko(); i++) {
            System.out.println(lista.arvo(i));
        }

    }

}
