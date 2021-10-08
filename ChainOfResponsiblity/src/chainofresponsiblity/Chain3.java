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
public class Chain3 extends OperationCor {

    @Override
    public void process() {
        System.out.println("Chain3 işlem yaptı...");

        boolean success = true;

        if (success) {
            OperationCor next = getSuccessor();
            if (next != null) {
                next.process();
            }
        } else {
            System.out.println("Chain3'te bir hata oluştu!");
              rollback();
        }

    }

    @Override
    protected void rollback() {
        System.out.println("Chain3 işlemi geri aldı...");

        OperationCor previous = getCanceller();
        if (previous != null) {
            previous.rollback();
        }
    }
}
