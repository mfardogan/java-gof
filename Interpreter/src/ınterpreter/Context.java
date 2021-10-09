/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınterpreter;

/**
 *
 * @author mfard
 */
public class Context {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Context(int number) {
        this.number = number;
    }
}
