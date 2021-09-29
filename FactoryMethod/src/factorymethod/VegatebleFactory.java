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
public class VegatebleFactory {

    public Vegetable getVegetable(String name) {
        Vegetable instance = null;
        if (name == "patates") {
            instance = new Patato();
        } else if (name == "domates") {
            instance = new Tomato();
        }
        return instance;
    }
}
