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
public class User {

    private final String nick;

    public String getNick() {
        return nick;
    }
    private IChatMediator mediator;

    public void setMediator(IChatMediator mediator) {
        this.mediator = mediator;
    }

    public User(String nick) {
        this.nick = nick;
    }

    public void send(String message) {
        mediator.send(this, message);
    }

    public void handle(User user, String message) {
        System.out.println("Gönderici: " + user.nick + ": " + message + " Alıcı: " + nick);
    }
}
