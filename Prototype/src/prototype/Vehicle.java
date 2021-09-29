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
public class Vehicle implements Cloneable {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private VehicleProperty vehicleProperty;

    public VehicleProperty getVehicleProperty() {
        return vehicleProperty;
    }

    public void setVehicleProperty(VehicleProperty vehicleProperty) {
        this.vehicleProperty = vehicleProperty;
    }

    public Vehicle shallowCopy() throws CloneNotSupportedException {
        Vehicle v = (Vehicle) clone();
        return v;
    }
    
    public Vehicle deepCopy() throws CloneNotSupportedException{
        Vehicle vehicle = shallowCopy();
        vehicle.vehicleProperty = new VehicleProperty();
        return vehicle;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
}
