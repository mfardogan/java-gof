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
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IOException io = new IOException();
        log(io);
        
        ConnectionException connection = new ConnectionException();
        log(connection);
        
        Rd3Exception rd3 = new Rd3Exception(3, "Bilinmeyen hata!");
        Rd3ExceptionAdapter adapter = new Rd3ExceptionAdapter(rd3);
        log(adapter);
    }

    public static void log(IException exception) {
        System.out.println(exception.getCode() + " kodlu hata kaydedildi!");
    }

}
