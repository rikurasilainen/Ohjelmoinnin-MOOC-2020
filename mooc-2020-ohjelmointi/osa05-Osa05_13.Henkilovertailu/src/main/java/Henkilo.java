
import java.util.Objects;

public class Henkilo {
 
    private String nimi;
    private Paivays syntymaPaiva;
    private int pituus;
    private int paino;

    public Henkilo(String nimi, Paivays syntymaPaiva, int pituus, int paino) {
        this.nimi = nimi;

        this.syntymaPaiva = syntymaPaiva;

        this.pituus = pituus;

        this.paino = paino;

    }

    

    public boolean equals(Object verrattava) {
        if (!(verrattava instanceof Henkilo)) {
            return false;
        }
        Henkilo verrattavaHenkilo = (Henkilo) verrattava;
      
        if (this.nimi.equals(verrattavaHenkilo.nimi) &&
                this.paino == verrattavaHenkilo.paino &&
                this.pituus == verrattavaHenkilo.pituus)
            return verrattavaHenkilo.syntymaPaiva.equals(syntymaPaiva);
        return false;
    }
}

 