
import java.util.Scanner;



public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia josta kutsut ohjelmoitavia metodeja
        Scanner lukija = new Scanner(System.in);
        Tarkistin tarkistin = new Tarkistin();
        String syote = lukija.nextLine();
        if (tarkistin.kellonaika(syote)) {
            System.out.println("Muoto ei ole oikea.");
        } else {
            System.out.println("Muoto ei ole oikea.");
        }       
    }
}
