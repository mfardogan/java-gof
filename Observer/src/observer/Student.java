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
public class Student implements IObserver {

    public void enjoy() {
        System.out.println("Eğlen!");
    }

    public void listen() {
        System.out.println("Dersi dinle!");
    }

    @Override
    public void handle(ISubject subject) {
        Teacher teacher = (Teacher) subject;
        if (teacher.getIsExplaining()) {
            listen();
        } else {
            enjoy();
        }
    }
}
