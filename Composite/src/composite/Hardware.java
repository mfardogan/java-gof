/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mfard
 */
public class Hardware implements IComposite {

    private final List<IComponent> components = new ArrayList<>();

    @Override
    public IComposite addChild(IComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public void traverse() {
        System.out.println("Donanım birimi çalışıyor...");
        
        components.forEach((compo) -> {
            compo.traverse();
        });
    }

}
