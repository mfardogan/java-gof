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
public class TvControl {
 
    private TvCommand[] commands = new TvCommand[4];
    
    public TvControl(Television tv){
        commands[0] = new NextChannelCommand(tv);
        commands[1] = new PreviousChannelCommand(tv);
        commands[2] = new VolumeDownCommand(tv);
        commands[3] = new VolumeUpCommand(tv);
    }
    
    public void press(int i){
        TvCommand command = commands[i];
        command.execute();
    }
}
