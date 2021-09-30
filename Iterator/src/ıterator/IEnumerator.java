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
public interface IEnumerator<T> {
    IIterable<T> createIterator();
}
