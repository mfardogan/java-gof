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
public class Football extends ComputerGame {

    @Override
    public void prepate() {
        System.out.println("Futbol oyunu hazırlanıyor...");
    }

    @Override
    public void start() {
        System.out.println("Futbol oyunu başlatılıyor...");
    }

    @Override
    public void finish() {
        System.out.println("Futbol oyunu kapatılıyor...");
    }

    @Override
    public void printStatistics() {
        System.out.println("Futbol oyunu istatistikleri yazdırılıyor...");
    }
}
