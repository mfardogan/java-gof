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
public class CodeGeneration  extends CompilerCor{

    @Override
    public void Handle() {
        System.out.println("Hedef kod üretildi!");
        
        CompilerCor next = getSuccessor();
        if(next != null){
            next.Handle();
        }
    }
    
}
