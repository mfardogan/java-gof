/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author mfard
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television tv = new Television();
        tv.toggle();
        tv.toggle();
        tv.toggle();
    }
    
}
