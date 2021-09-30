/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author mfard
 */
public class Mobile {
    private String brand, model;
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    
    public Mobile(String brand, String model){
        this.model = model;
        this.brand = brand;
    }
    
    public void call(String phoneNumber){
        System.out.println(phoneNumber + " aranıyor...");
    }
    
    public void accept(IMobileVisitor visitor){
        visitor.visit(this);
    }
}
