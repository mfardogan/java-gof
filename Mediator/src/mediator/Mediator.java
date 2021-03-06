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
public class Mediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         /*
        Daha konforlu bir kullanım için video çekildikten sonra 
        user.setMediator(this); değişikliği yapılmıştır.
        Bu saye de User için nesne örneği alındığı yerde 
        kurucu parametresi vermeye gerek kalmayacaktır.
        */
         
        IChatMediator room = new ChatRoom();
        User ahmet = new Ahmet();
        room.addUser(ahmet);

        User mehmet = new Mehmet();
        room.addUser(mehmet);

        User yasemin = new Yasemin();
        room.addUser(yasemin);
        
        User faruk = new Faruk();
        room.addUser(faruk);
        
        ahmet.send("Selam millet!");
        yasemin.send("Selam Ahmet hoşgeldin =)");
        mehmet.send("Selam Ahmet =)");
        faruk.send("Merhaba Ahmet bugün nasılsın?");
    }
    
}
