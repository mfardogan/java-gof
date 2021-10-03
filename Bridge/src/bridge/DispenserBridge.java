/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

/**
 *
 * @author mfard
 */
public class DispenserBridge {
    private final ICarboy carboy;
    private final IDispenser dispenser;

    public DispenserBridge(ICarboy carboy, IDispenser dispenser) {
        this.carboy = carboy;
        this.dispenser = dispenser;
    }
    
    public Water hot(){
        Water wather = carboy.flow();
        return dispenser.hot(wather);
    }
    
    public Water cold(){
        Water wather = carboy.flow();
        return dispenser.cold(wather);
    }
    
    public Water normal(){
        Water wather = carboy.flow();
        return dispenser.normal(wather);
    }
}
