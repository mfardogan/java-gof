/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author mfard
 */
public class Saka implements ICarboy {

    @Override
    public Water flow() {
        Water water = new Water();
        water.setDegree(30);
        return water;
    }
}
