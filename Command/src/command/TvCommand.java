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
public abstract class TvCommand {

    protected Television tv;

    public TvCommand(Television tv) {
        this.tv = tv;
    }

    public abstract void execute();
}
