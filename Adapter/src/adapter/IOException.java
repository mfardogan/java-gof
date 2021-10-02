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
public class IOException implements IException{

    @Override
    public int getCode() {
        return 1;
    }

    @Override
    public String getMessage() {
        return "Dosya açma hatası!";
    }
    
}
