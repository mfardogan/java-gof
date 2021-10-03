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
public abstract class PizzaDecorator  extends Pizza{

    private final Pizza pizza;

    protected Pizza getPizza() {
        return pizza;
    }

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public abstract double price();
}
