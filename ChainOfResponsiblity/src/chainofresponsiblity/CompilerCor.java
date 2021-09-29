/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsiblity;

/**
 *
 * @author mfard
 */
public abstract class CompilerCor {
    private CompilerCor successor;
    
    public CompilerCor setSuccessor(CompilerCor successor){
        this.successor = successor;
        return this;
    }
    
    public CompilerCor getSuccessor(){
        return successor;
    }
    
    public abstract void Handle();
}
