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
public class IntermediateCode  extends  CompilerCor{

    @Override
    public void Handle() {
      System.out.println("Ara kod üretimi yapıldı!");
        
        CompilerCor next = getSuccessor();
        if(next != null){
            next.Handle();
        }
    }
    
}
