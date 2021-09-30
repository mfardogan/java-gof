/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıterator;

/**
 *
 * @author mfard
 */
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cluster<Integer> cluster = new Cluster<>();
        for (int i = 1; i < 99; i+=2) {
            cluster.add(i);
        }

        IIterable<Integer> iter = cluster.createIterator();
        while (iter.hasMore()) {
            int next = iter.getNext();
            System.out.println(next);
        }
    }

}
