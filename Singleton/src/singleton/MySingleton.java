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
public class MySingleton {

    private MySingleton() {
    }

    private static MySingleton instance;
    private static Object locker = new Object();

    public static MySingleton getInstance() throws InterruptedException {

        if (instance == null) {
            synchronized (locker) {
                if (instance == null) {
                    Thread.sleep(1000);
                    instance = new MySingleton();
                }
            }
        }
        
        return instance;
    }

    public void printHashCode() {
        System.out.println(hashCode());
    }
}
