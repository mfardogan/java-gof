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
public class Chain2 extends OperationCor {

    @Override
    public void process() {
        System.out.println("Chain2 işlem yaptı...");

        boolean success = false;
        if (success) {
            OperationCor next = getSuccessor();
            if (next != null) {
                next.process();
            }
        } else {
            System.out.println("Chain2'de bir hata oluştu!");
            rollback();
        }
    }

    @Override
    protected void rollback() {
        System.out.println("Chain2 işlemi geri aldı...");

        OperationCor previous = getCanceller();
        if (previous != null) {
            previous.rollback();
        }
    }
}
