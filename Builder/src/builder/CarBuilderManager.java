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
public class CarBuilderManager {
    private ICarBuilder builder;
    public CarBuilderManager(ICarBuilder builder){
        this.builder = builder;
    }
    
    public Car create(){
        builder.setBrand();
        builder.setModel();
        return builder.getCar();
    }
}
