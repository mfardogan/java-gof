/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author mfard
 */
public interface IComposite  extends  IComponent{
    IComposite addChild(IComponent component);
}
