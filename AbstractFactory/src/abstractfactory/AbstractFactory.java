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
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GreenVegetableFactory factory = new GreenVegetableFactory();
        factory.createOnion();
        factory.createPepper();
        
        VegetableFactoryManager manager = new VegetableFactoryManager(new GreenVegetableFactory());

        GreenOnion greenOnion = (GreenOnion) manager.createOnion();
        System.out.println(greenOnion.getName());

        GreenPepper greenPepper = (GreenPepper) manager.createPepper();
        System.out.println(greenPepper.getName());

        manager = new VegetableFactoryManager(new RedVegetableFactory());
        RedOnion redOnion = (RedOnion) manager.createOnion();
        System.out.println(redOnion.getName());

        RedPepper redPepper = (RedPepper) manager.createPepper();
        System.out.println(redPepper.getName());

    }

}
