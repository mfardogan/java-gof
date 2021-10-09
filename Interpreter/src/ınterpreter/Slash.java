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
public class Slash implements IAbstractExpression{

    private int number;

    public Slash(int number) {
        this.number = number;
    }
    
    @Override
    public void interpret(Context context) {
        int newValue = context.getNumber() / number;
        context.setNumber(newValue);
    }
}
