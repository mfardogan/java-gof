/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author mfard
 */
public class Yasemin extends  User{
    
     /*
        Daha konforlu bir kullanım için video çekildikten sonra 
        user.setMediator(this); değişikliği yapılmıştır.
        Bu saye de User için nesne örneği alındığı yerde 
        kurucu parametresi vermeye gerek kalmayacaktır.
        */
    public Yasemin() {
        super("Yasemin");
    }
}
