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
public class SpecialPizzaDecorator extends  PizzaDecorator{

    public SpecialPizzaDecorator(Pizza pizza) {
        super(pizza);
        
        setName("Özel pizza");
        for (String pi : pizza.getPieces()) {
            getPieces().add(pi);
        }
        
        getPieces().add("Özel malzeme - 1");
        getPieces().add("Özel malzeme - 2");
    }

    @Override
    public double price() {
       return getPizza().price()+ 20;
    }
}
