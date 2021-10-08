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
public class Vehicle implements IVehicle {

    @Override
    public void drive(Person person) {
        System.out.println(person.getName() + " "
                + person.getSurname() + " aracı kullanıyor...");
    }
}
