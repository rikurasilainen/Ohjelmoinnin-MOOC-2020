
public class Main {

    public static void main(String[] args) {
        Henkilo eka = new Henkilo("Leevi", new Paivays(1, 1, 2017), 70, 10);
        Henkilo toka = new Henkilo("Leevi", new Paivays(1, 1, 2017), 70, 10);
        System.out.println(eka.equals(toka));
    }
}
