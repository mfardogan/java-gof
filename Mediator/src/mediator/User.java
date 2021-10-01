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
    private final IChatMediator mediator;

    public User(String nick, IChatMediator mediator) {
        this.nick = nick;
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(this, message);
    }

    public void handle(User user, String message) {
        System.out.println("Gönderici: " + user.nick + ": " + message + " Alıcı: " + nick);
    }
}
