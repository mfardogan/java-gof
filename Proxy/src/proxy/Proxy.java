/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author mfard
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Person person = new Person("Ahmet", "Soylu", true);
        Person person2 = new Person("Mehmet", "Soylu", false);

        /*
        Vehicle vehicle = new Vehicle();
        vehicle.drive(person);
        vehicle.drive(person2);
        */
        
        VehicleProxy proxy = new VehicleProxy();
        proxy.drive(person);
        proxy.drive(person2);
    }
}
