
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lukutaitovertailu {

    public static void main(String[] args) {

        ArrayList<Lukutaito> lukutaito = new ArrayList();

        try {
            Files.lines(Paths.get("lukutaito.csv")).map(s -> s.split(","))
                    .map(s -> new Lukutaito(s[2].replace("(%)", "").trim(), s[3], Integer.valueOf(s[4]), Double.valueOf(s[5])))
                    .forEach(l -> lukutaito.add(l));
        } catch (Exception e) {
            System.out.println(e);
        }

        lukutaito.stream().sorted((l1, l2) -> {
            if (l1.getProsentti() > l2.getProsentti()) {
                return 1;
            }
            if (l1.getProsentti() < l2.getProsentti()) {
                return -1;
            }
            return 0;
        }).forEach(l -> System.out.println(l));
    }
}