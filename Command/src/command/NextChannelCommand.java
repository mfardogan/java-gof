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
public class NextChannelCommand extends TvCommand {
    
    public NextChannelCommand(Television tv) {
        super(tv);
    }
    
    @Override
    public void execute() {
        int channel = tv.getChannelNumber();
        tv.setChannelNumber(channel + 1);
    }
    
}
