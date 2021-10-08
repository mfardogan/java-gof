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
public class MercedesBuilder implements ICarBuilder{

    private Car car = new Car();
    
    @Override
    public void setModel() {
       car.setModel("C 180");
    }

    @Override
    public void setBrand() {
       car.setBrand("Mercedes");
    }

    @Override
    public Car getCar() {
        return car;
    }
    
}
