/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 01/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This class models a circle
 */
public class Circle extends Shape {
    
    
    private Ellipse2D circbuffer;
    private List<Ellipse2D> circContainer = new ArrayList();
   

    public Circle() {     
    }
    
    /**
     * Continue drawing. This method draws the modifications done by the circles while the user
     * drags the mouse but without saving them as final
     * @param xStart: where the circle begins in x axis
     * @param yStart: where the circle begins in y axis
     * @param xEnd: where the circle ends in x axis
     * @param yEnd: where the circle ends in y axis
     * @param g2: Graphics2D where circles are being drawn
     */
    @Override
    public void continueDrawing(int xStart, int yStart, int xEnd, int yEnd, Graphics2D g2) {
        //Asigns the value where the user clicked first as the start of the circle
        this.xStart = xStart;
        this.yStart = yStart;
        //Sets stored color
        g2.setColor(color);
        circbuffer = new Ellipse2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
        g2.draw(circbuffer);
    }
    
    /** finishDrawing. This method saves the circle that the user defined as their final decision
     * 
     * @param xEnd: where the circle ends in x axis
     * @param yEnd: where the circle ends in y axis
     * @param g2: Graphics2D where circles are being drawn
     */
    @Override
    public void finishDrawing(int xEnd, int yEnd, Graphics2D g2) {
            g2.setColor(color);
            circbuffer = new Ellipse2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
            //saves chosen circle
            circContainer.add(circbuffer);
    }

    /**
     * drawAll. This method draws all the final stored circles
     * @param g2. Graphics2D where circles are being drawn
     */
    @Override
    public void drawAll(Graphics2D g2) {
        g2.setColor(color);
        //Paints all circles
        for (int x = 0; x < circContainer.size(); x++)
         {
          g2.draw(circContainer.get(x));
         }
        
        
    }
}
