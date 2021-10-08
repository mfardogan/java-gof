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
public class Chain1 extends OperationCor{

    @Override
    public void process() {
        System.out.println("Chain1 işlem yaptı...");
        
        OperationCor next = getSuccessor();
        if(next != null){
            next.process();
        }
    }

    @Override
    protected void rollback() {
        System.out.println("Chain1 işlemi geri aldı...");
        
        OperationCor previous = getCanceller();
        if(previous != null){
            previous.rollback();
        }
    }
    
}
