/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ıterator;

import java.util.List;

/**
 *
 * @author mfard
 */
public class ClusterIterator<T> implements IIterable<T> {

    private int i = 0;
    private final List<T> collection;

    public ClusterIterator(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public T getNext() {
        return collection.get(i++);
    }

    @Override
    public boolean hasMore() {
        return i < collection.size();
    }

}
