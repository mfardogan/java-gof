/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author mfard
 */
public class Television {

    private ITelevisionState state = new Off();
    public void setSate(ITelevisionState state) {
        this.state = state;
    }

    public void toggle() {
      state.change(this);
    }
}
