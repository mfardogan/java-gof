/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author mfard
 */
public class SpecialSpecialPizzaDecorator  extends  PizzaDecorator{

    public SpecialSpecialPizzaDecorator(Pizza pizza) {
        super(pizza);
        
        setName("Özel özel pizza");
        
        for(String pi: pizza.getPieces()){
            getPieces().add(pi);
        }
        
        getPieces().add("Özel özel malzeme - 1");
        getPieces().add("Özel özel malzeme - 2");

    }

    @Override
    public double price() {
       return getPizza().price() + 40;
    }
    
}
