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
public class Visitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IMobileVisitor photographer = new PhotographerVisitor();
        IMobileVisitor videChat = new VideoChatVisitor();
        
        IPhoneX iphone = new IPhoneX();
        iphone.call("+90545");
        iphone.accept(photographer);
        iphone.accept(videChat);
        
        SamsungGalaxy samsung = new SamsungGalaxy();
        samsung.call("+90555");
        samsung.accept(photographer);
        samsung.accept(videChat);
        
        Nokia3310 nokia  =new Nokia3310();
        nokia.call("+900535");
        
       
    }
}
