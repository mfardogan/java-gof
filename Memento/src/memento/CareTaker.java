/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author mfard
 */
public class CareTaker {
    private final MouseOriginator originator;

    public CareTaker(MouseOriginator originator) {
        this.originator = originator;
    }

    public MouseOriginator getOriginator() {
        return originator;
    }
}
