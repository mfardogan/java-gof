/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.HashMap;

/**
 *
 * @author mfard
 */
public class FlyweightSquare {

    private static final HashMap map = new HashMap();

    public static Square get(String color) {
        Square square = (Square) map.get(color);
        if (square == null) {
            square = new Square();
            square.setColor(color);
            map.put(color, square);
        }
        return square;
    }
    
    public static int getInstanceCount(){
        return map.size();
    }
}
