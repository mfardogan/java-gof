/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mfard
 */
public abstract class Pizza {

    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<String> pieces = new ArrayList<>();

    public List<String> getPieces() {
        return pieces;
    }

    public abstract double price();
}
