
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);

        int x = koko / 2;
        int y = 0;
        int luku = 1;
        int luvut = koko * koko;
        while (luku <= luvut) {
            nelio.asetaArvo(x, y, luku);
            int ekaY = y - 1;
            int tokaX = x + 1;
            if (ekaY < 0) {
                ekaY = ekaY + koko;
            }
            if (tokaX >= koko) {
                tokaX = tokaX % koko;
            }
            if (nelio.annaArvo(tokaX, ekaY) == 0) {
                x = tokaX;
                y = ekaY;
            } else {
                y++;
                if (y >= koko) {
                    y = 0;
                }
            }
            luku++;
        }
        return nelio;
    }
}
