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
public class VestelErikliCombination extends DispenserBridge {

    public VestelErikliCombination() {
        super(new Erikli(), new Vestel());
    }
}
