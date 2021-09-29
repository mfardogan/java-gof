/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author mfard
 */
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here

        VehicleProperty vehicleProperty = new VehicleProperty();
        vehicleProperty.setColor("Kırmızı");

        Vehicle mercedes = new Vehicle();
        mercedes.setVehicleProperty(vehicleProperty);
        mercedes.setBrand("Mercedes E200");

        Vehicle mercedes2 = mercedes.deepCopy(); //mercedes.shallowCopy();
        mercedes2.setBrand("Mercedes C180");

        System.out.println(mercedes.getBrand());
        System.out.println(mercedes2.getBrand());

        mercedes2.getVehicleProperty().setColor("Siyah");

        System.out.println(mercedes.getVehicleProperty().getColor());
        System.out.println(mercedes2.getVehicleProperty().getColor());

    }

}
