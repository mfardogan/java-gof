/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author mfard
 */
public class PhotographerVisitor  implements IMobileVisitor {

    @Override
    public void visit(Mobile mobile) {
        System.out.println(mobile.getBrand() + " ile fotoğraf çekildi...");
    }
    
}
