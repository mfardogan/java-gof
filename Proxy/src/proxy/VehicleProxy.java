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
public class VehicleProxy implements IVehicle {

    private final Vehicle vehicle = new Vehicle();

    @Override
    public void drive(Person person) {
        if (!person.isHasDriverLicense()) {
            System.out.println("Bu kişi araç kullanamaz!");
            return;
        }

        vehicle.drive(person);
    }
}
