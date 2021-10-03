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
public class Vestel implements IDispenser{

    @Override
    public Water hot(Water w) {
        w.setDegree(95);
        return w;
    }

    @Override
    public Water cold(Water w) {
        w.setDegree(10);
        return w;
    }

    @Override
    public Water normal(Water w) {
       return w;
    } 
}
