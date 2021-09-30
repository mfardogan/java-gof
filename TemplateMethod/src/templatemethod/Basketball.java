/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author mfard
 */
public class Basketball extends ComputerGame {

    @Override
    public void prepate() {
        System.out.println("Basketbol oyunu başlatılıyor...");
    }

    @Override
    public void start() {
        System.out.println("Basketbol oyunu başlatılıyor...");
    }

    @Override
    public void finish() {
        System.out.println("Basketbol oyunu kapatılıyor...");
    }

    @Override
    public void printStatistics() {
       System.out.println("Basketbol oyunu istatistikleri yazdırılıyor...");
    }
}
