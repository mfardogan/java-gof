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
public class RedVegetableFactory extends VegetableFactory{

    @Override
    public Vegetable createOnion() {
       return new RedOnion();
    }

    @Override
    public Vegetable createPepper() {
       return new RedPepper();
    }
    
}
