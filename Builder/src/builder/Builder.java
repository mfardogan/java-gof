/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author mfard
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Örnek-1: Builder pattern */
        CarBuilderManager manager = new CarBuilderManager(new AudiBuilder());
        Car audi = manager.create();

        System.out.println(audi.getBrand());
        System.out.println(audi.getModel());

        /* Örnek-2: Fluent Builder Pattern (GoF dışı) */
        Coffee coffee = 
                new Coffee.Builder()
                        .setMilk(true)
                        .setSugar(true)
                        .setChocolate(true)
                        .build();
        coffee.summary();

        Coffee coffee2 = 
                new Coffee.Builder()
                        .setMilk(true)
                        .setSugar(true)
                        .build();
        coffee2.summary();

        Coffee coffee3 = 
                new Coffee.Builder()
                        .setSugar(true)
                        .setChocolate(true)
                        .build();
        coffee3.summary();
    }
}
