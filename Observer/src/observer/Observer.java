/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author mfard
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Teacher teacher = new Teacher();
        
        teacher.addObserver(new Student())
                .addObserver(new Student())
                .addObserver(new Student())
                .addObserver(new Mufettis());
        
        teacher.enterClass();
        teacher.quitClass();
    }
}
