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
        
        Person ahmet = new Person();
        ahmet.setName("Ahmet");
        ahmet.setSurname("Soylu");
        ahmet.setHasDriverLicense(true);
        
        Person mehmet = new Person();
        mehmet.setName("Mehmet");
        mehmet.setSurname("Soylu");
        mehmet.setHasDriverLicense(false);
        
        VehicleProxy vehicle = new VehicleProxy();
        vehicle.drive(mehmet);
        vehicle.drive(ahmet);
    }
}
