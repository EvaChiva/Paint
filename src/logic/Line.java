/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

/**
 * @date 01/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This class models a line
 */
public class Line extends Shape{
    
    //Attributtes
    private Line2D linebuffer;
    private List<Line2D> lineContainer = new ArrayList();
   
     /**
     * Continue drawing. This method draws the modifications done by the lines while the user
     * drags the mouse but without saving them as final
     * @param xStart: where the line begins in x axis
     * @param yStart: where the line begins in y axis
     * @param xEnd: where the line ends in x axis
     * @param yEnd: where the line ends in y axis
     * @param g2: Graphics2D where lines are being drawn
     */
    @Override
    public void continueDrawing(int xStart, int yStart, int xEnd, int yEnd, Graphics2D g2) {
        //Asigns the value where the user clicked first as the start of the square
        this.xStart = xStart;
        this.yStart = yStart;
        //Sets stored color
        g2.setColor(color);
        linebuffer = new Line2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
        g2.draw(linebuffer);
            
    }

    /** 
     * finishDrawing. This method saves the line that the user defined as their final decision
     * @param xEnd: where the line ends in x axis
     * @param yEnd: where the line ends in y axis
     * @param g2: Graphics2D where lines are being drawn
     */
    @Override
    public void finishDrawing(int xEnd, int yEnd, Graphics2D g2) {

            g2.setColor(color);
            linebuffer = new Line2D.Float((float) xStart,(float) yStart,(float) xEnd,(float) yEnd);
            //Saves chosen line
            lineContainer.add(linebuffer);
    }

     /**
     * drawAll. This method draws all the final stored lines
     * @param g2. Graphics2D where lines are being drawn
     */
    @Override
    public void drawAll(Graphics2D g2) {
        g2.setColor(color);
        //Paints all the lines
        int i = 0;
        for (int x = 0; x < lineContainer.size(); x++)
         {
             g2.draw(lineContainer.get(x));
             
         }
    }
    
}
