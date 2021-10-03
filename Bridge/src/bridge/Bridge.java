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
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Kötü tasarım
        
            ***************** Sebil ***************
            *              Marka    : Bosch       *
            *              Damacana : Saka        *
            ***************************************
        
            ***************** Sebil ***************
            *              Marka    : Siemens     *
            *              Damacana : Saka        *
            ***************************************
        
            ***************** Sebil ***************
            *              Marka    : Bosch       *
            *              Damacana : Erikli      *
            ***************************************
        
            *************** Sebil *****************
            *              Marka    : Siemens     *
            *              Damacana : Erikli      *
            ***************************************
         */
        
        /* İyi tasarım
        
            ***************** Bridge ***************
            *              Marka    : IDispenser   *
            *              Damacana : ICarboy      *
            ****************************************
        */
        
        DispenserBridge bridge = new DispenserBridge(new Saka(), new Vestel());
        Water w1 = bridge.cold();
        System.out.println(w1.getDegree());
        
        Water w2 = bridge.hot();
        System.out.println(w2.getDegree());
        
        Water w3 = bridge.normal();
        System.out.println(w3.getDegree());
        
        
        VestelErikliCombination combination = new VestelErikliCombination();
        combination.cold();
        combination.hot();
        combination.normal();
    }
}
