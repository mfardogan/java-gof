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
public class VolumeUpCommand extends TvCommand {
    
    public VolumeUpCommand(Television tv) {
        super(tv);
    }
    
    @Override
    public void execute() {
        int volume = tv.getVolumeLevel();
        tv.setVolumeLevel(volume + 1);
    }
    
}
