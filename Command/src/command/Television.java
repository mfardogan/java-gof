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
public class Television {

    private int volumeLevel = 10;
    private int channelNumber = 1;

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int level) {
        volumeLevel = level;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int number) {
        channelNumber = number;
    }
    
    public TvControl createControl(){
        return new TvControl(this);
    }
}
