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
public class Mufettis implements IObserver{

    @Override
    public void handle(ISubject subject) {
      Teacher teacher = (Teacher) subject;
        if (teacher.getIsExplaining()) {
            System.out.println("Öğretmeni dinle!");
        } else {
            System.out.println("Öğretmeni takip et!");
        }
    }
}
