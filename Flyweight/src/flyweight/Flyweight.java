/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.Random;

/**
 *
 * @author mfard
 */
public class Flyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] colors = new String[]{"Kırmızı", "Siyah", "Yeşil"};
        Random generator = new Random();

        for (int i = 0; i < 100; i++) {
            int c = generator.nextInt(colors.length);

            Square square = FlyweightSquare.get(colors[c]);

            int x = generator.nextInt(1000);
            int y = generator.nextInt(800);

            square.setX(x);
            square.setY(y);
            square.draw();
        }

        System.out.println("Oluşan nesnelerin sayısı: " + FlyweightSquare.getInstanceCount());
    }
}
