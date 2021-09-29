/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author mfard
 */
public class Strategy {

    private static HashAlgorithmStrategy strategy = new HashAlgorithmStrategy(new SHA256());
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(strategy.compute("Test"));
    }
}
