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

        CarBuilderManager manager = new CarBuilderManager(new BmwBuilder());
        Car audi = manager.create();
        
        System.out.println(audi.getBrand());
        System.out.println(audi.getModel());
    }
}
