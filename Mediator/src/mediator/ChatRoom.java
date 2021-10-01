/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mfard
 */
public class ChatRoom implements  IChatMediator{

    private final List<User> users = new ArrayList<>();
    
    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void send(User user, String message) {
       for(User us : users){
           if(us.getNick() == user.getNick()){
               continue;
           }
           
           us.handle(user, message);
       }
    }
    
}
