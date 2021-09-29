/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author mfard
 */
public class VegetableFactoryManager {
    private VegetableFactory factory;
    public VegetableFactoryManager(VegetableFactory factory){
        this.factory = factory;
    }
    
    public Vegetable createOnion(){
        return factory.createOnion();
    }
    
    public  Vegetable createPepper(){
        return factory.createPepper();
    }
}
