/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author mfard
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        VegatebleFactory factory = new VegatebleFactory();
        Tomato tomato = (Tomato) factory.getVegetable("domates");
        System.out.println(tomato.getName());

        Patato patato = (Patato) factory.getVegetable("patates");
        System.out.println(patato.getName());
    }

}
