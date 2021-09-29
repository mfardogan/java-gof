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
public class On implements ITelevisionState {

    @Override
    public void change(Television tv) {
        tv.setSate(new Off());
        System.out.println("Televizyon kapalı konuma getirildi!");
    }

}
