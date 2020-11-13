/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

/**
 *
 * @author Vapa MkIV
 */
import java.util.Random;
import javafx.scene.shape.Polygon;

public class Asteroidi extends Hahmo {
    
    private double pyorimisliike;

    public Asteroidi(int x, int y) {
        
        super(new Monikulmiotehdas().luoMonikulmio(), x, y);
        Random r = new Random();
        super.getHahmo().setRotate(r.nextInt(360));
        int kiihdytystenMaara = 1 + r.nextInt(10);
        
        for (int i = 0; i < kiihdytystenMaara; i++) {
            kiihdyta();
        }
        this.pyorimisliike = 0.5 - r.nextDouble();
    }

    public void liiku() {
        super.liiku();
        super.getHahmo().setRotate(super.getHahmo().getRotate() + pyorimisliike);
    }
}
