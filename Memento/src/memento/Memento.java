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
public class Memento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Mouse mouse = new Mouse(10, 90);
        mouse.move();
        mouse.move();
        mouse.move();

        System.out.println("X: " + mouse.getX());
        System.out.println("Y: " + mouse.getY());

        CareTaker careTaker = new CareTaker(mouse.backup());
        System.out.println("Mouse koordinatları yedeklendi!");
        
        mouse.move();
        mouse.move();
        
        System.out.println("X: " + mouse.getX());
        System.out.println("Y: " + mouse.getY());
        mouse.setup(careTaker.getOriginator());
       
        System.out.println("Mouse koordinatları geri yüklendi!");
        System.out.println("X: " + mouse.getX());
        System.out.println("Y: " + mouse.getY());
    }

}
