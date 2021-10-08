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
public class ChainOfResponsiblity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Örnek - 1: */ 
        CompilerCor compiler = new Lexical().setSuccessor(
                new Semantic().setSuccessor(
                        new IntermediateCode().setSuccessor(
                                new Optimization().setSuccessor(
                                        new CodeGeneration()
                                ))));
        
          compiler.Handle();
        
        
 /* Örnek - 2: */
        OperationCor operation = new Chain1()
                .addSuccessor(new Chain2().addSuccessor(
                        new Chain3().addSuccessor(
                                new Chain0())));
        
        operation.process();
    }
}
