/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author mfard
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        new Thread(() -> {
            try {
                MySingleton.getInstance().printHashCode();
            } catch (InterruptedException e) {

            }
        }).start();

        new Thread(() -> {
            try {
                MySingleton.getInstance().printHashCode();
            } catch (InterruptedException e) {

            }
        }).start();

        new Thread(() -> {
            try {
                MySingleton.getInstance().printHashCode();
            } catch (InterruptedException e) {

            }
        }).start();

        new Thread(() -> {
            try {
                MySingleton.getInstance().printHashCode();
            } catch (InterruptedException e) {

            }
        }).start();
    }
}
