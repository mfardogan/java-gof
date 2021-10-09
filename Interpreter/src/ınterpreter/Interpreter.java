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
public class Interpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Context context = new Context(100);

        IAbstractExpression[] expressions = new IAbstractExpression[6];
        expressions[0] = new Plus(10);
        expressions[1] = new Minus(5);
        expressions[2] = new Star(3);
        expressions[3] = new Slash(2);
        expressions[4] = new Minus(7);
        expressions[5] = new Star(2);

        for (IAbstractExpression exp : expressions) {
            exp.interpret(context);
        }

        System.out.println("Sonuç: " + context.getNumber());
    }

}
