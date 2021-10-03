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
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* C = Composite, L = Leaf
                                     C
                                   *   *
                                  *     *
                                 *       *
                                C         L
                              *   *
                             *     *
                            *       C
                           L       *  *
                                  *    *
                                 *      *
                                L         L
        
         */
 /* C = Composite, L = Leaf
                                  Computer
                                   *   *
                                  *     *
                                 *       *
                             Hardware   Software
                              *   *
                             *     *
                            *       *
                      Input Unit  Output Unit
                         * *           * *
                       *    *          *  *
                     *        *        *   *
                   Mouse     Keyborard *    *
                                       *     *
                                    Speaker   Monitor
         */
 
        IComposite output = new OutputUnit().addChild(new Speaker()).addChild(new Monitor());
        IComposite input = new InputUnit().addChild(new Mouse()).addChild(new Keyborard());

        IComposite hardware = new Hardware().addChild(output).addChild(input);

        IComposite software = new Software();

        IComposite computer = new Computer().addChild(hardware).addChild(software);
        computer.traverse();
    }

}
