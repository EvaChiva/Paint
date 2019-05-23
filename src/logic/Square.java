/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 01/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This class models a square or rectangle
 */
public class Square extends Shape{
    
    //Attributtes
    //Stores rectangles
    private Rectangle2D rectbuffer;
    private List<Rectangle2D> rectContainer = new ArrayList();
    
    public Square (){  
    }
    
    /**
     * Continue drawing. This method draws the modifications done by the squares while the user
     * drags the mouse but without saving them as final
     * @param xStart: where the square begins in x axis
     * @param yStart: where the square begins in y axis
     * @param xEnd: where the square ends in x axis
     * @param yEnd: where the square ends in y axis
     * @param g2: Graphics2D where squares are being drawn
     */
    @Override
    public void continueDrawing(int xStart, int yStart, int xEnd, int yEnd, Graphics2D g2) {
        //Asigns the value where the user clicked first as the start of the square
        this.xStart = xStart;
        this.yStart = yStart;
        //Sets stored color
        g2.setColor(color);
        rectbuffer = new Rectangle2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
        g2.draw(rectbuffer);
            
    }

    /** finishDrawing. This method saves the square that the user defined as their final decision
     * 
     * @param xEnd: where the square ends in x axis
     * @param yEnd: where the square ends in y axis
     * @param g2: Graphics2D where squares are being drawn
     */
    @Override
    public void finishDrawing(int xEnd, int yEnd, Graphics2D g2) {
            g2.setColor(color);
            rectbuffer = new Rectangle2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
            //Saves chosen square
            rectContainer.add(rectbuffer);
    }
    
    /**
     * drawAll. This method draws all the final stored squares
     * @param g2. Graphics2D where squares are being drawn
     */
    @Override
    public void drawAll(Graphics2D g2) {
       g2.setColor(color);
       //Paints all the squares
        for (int x = 0; x < rectContainer.size(); x++)
         {
          g2.draw(rectContainer.get(x));
         }
    }    
    
}
