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
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClassicPizza classic = new ClassicPizza();
        System.out.println(classic.getName());
        for(String pi : classic.getPieces()){
            System.out.println(pi);
        }
        
        System.out.println(classic.price());
        
        PizzaDecorator special = new SpecialPizzaDecorator(classic);
        System.out.println(special.getName());
        for(String pi: special.getPieces()){
            System.out.println(pi);
        }
        
        System.out.println(special.price());
        
        SpecialSpecialPizzaDecorator specialSpecialPizza = new SpecialSpecialPizzaDecorator(special);
        System.out.println(specialSpecialPizza.price());
    }
}
