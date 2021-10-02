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
public class ConnectionException implements IException {

    @Override
    public int getCode() {
        return 2;
    }

    @Override
    public String getMessage() {
        return "Bağlantı hatası!";
    }

}
