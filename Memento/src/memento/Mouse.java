/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author mfard
 */
public class Mouse {

    private int x, y;

    public Mouse() {
    }

    public Mouse(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void move(){
        x += 5;
        y += 5;
    }
    
    public MouseOriginator backup(){
        MouseOriginator originator = new MouseOriginator();
        originator.setX(x);
        originator.setY(y);
        return originator;
    }
    
    public void setup(MouseOriginator originator){
        setX(originator.getX());
        setY(originator.getY());
    }
}
