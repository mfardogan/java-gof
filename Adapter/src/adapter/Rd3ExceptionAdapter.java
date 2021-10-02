/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author mfard
 */
public class Rd3ExceptionAdapter implements IException{

    private final Rd3Exception adaptee;

    public Rd3ExceptionAdapter(Rd3Exception adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public int getCode() {
        return adaptee.getErrorCode();
    }

    @Override
    public String getMessage() {
        return adaptee.getErrorDescription();
    }
    
}
