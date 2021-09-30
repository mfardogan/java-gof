/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author mfard
 */
public abstract class ComputerGame {

    public abstract void prepate();

    public abstract void start();

    public abstract void finish();
    
    public abstract void printStatistics();
    
    public void game(){
        prepate();
        start();
        finish();
        printStatistics();
    }
}
