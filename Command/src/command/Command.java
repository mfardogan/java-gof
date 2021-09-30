/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author mfard
 */
public class Command {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television tv = new Television();
        TvControl control = tv.createControl();

        control.press(0);
        control.press(0);
        System.out.println(tv.getChannelNumber());
        control.press(1);
        System.out.println(tv.getChannelNumber());

        control.press(3);
        control.press(3);
        control.press(3);
        control.press(3);
        control.press(3);
        control.press(2);
        System.out.println(tv.getVolumeLevel());

    }

}
