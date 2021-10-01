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
public interface IChatMediator {
    void addUser(User user);
    void send(User user, String message);
}
