/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mfard
 */
public class Teacher implements  ISubject{

    private boolean  isExplaining = false;
    public boolean  getIsExplaining(){
        return isExplaining;
    }
    
    private List<IObserver> observers = new ArrayList<IObserver>();
    
    @Override
    public void subscribe() {
        for (IObserver observer : observers) {
            observer.handle(this);
        }
    }

    @Override
    public ISubject addObserver(IObserver observer) {
       observers.add(observer);
       return this;
    }
    
    public void enterClass(){
        isExplaining = true;
        subscribe();
    }
    
    public void quitClass(){
        isExplaining = false;
        subscribe();
    }
}
