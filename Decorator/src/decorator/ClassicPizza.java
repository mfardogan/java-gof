/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author mfard
 */
public class ClassicPizza extends Pizza{

    public ClassicPizza() {
        setName("Klasik pizza");
        
        getPieces().add("Malzeme-1");
        getPieces().add("Malzeme-2");
        getPieces().add("Malzeme-3");
    }

    
    
    @Override
    public double price() {
        return 40;
    }
}
