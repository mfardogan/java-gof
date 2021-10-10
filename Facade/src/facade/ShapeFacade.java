/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author mfard
 */
public class ShapeFacade {
    private Shape rectangle = new Rectangle();
    private Shape moon = new Moon();
    private Shape star = new Star();
    
    public void drawFlag(){
        drawRectangle();
        drawMoon();
        drawStar();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
    public void drawMoon(){
        moon.draw();
    }
    
    public void drawStar(){
        star.draw();
    }
}
