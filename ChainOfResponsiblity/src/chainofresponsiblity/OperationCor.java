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
public abstract class OperationCor {

    private OperationCor successor;
    private OperationCor canceller;

    protected OperationCor getCanceller() {
        return canceller;
    }

    protected OperationCor getSuccessor() {
        return successor;
    }

    public OperationCor addSuccessor(OperationCor successor) {
        successor.canceller = this;
        this.successor = successor;
        
        return this;
    }

    public abstract void process();

    protected abstract void rollback();
}
