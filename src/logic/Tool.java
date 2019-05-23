/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Graphics2D;


/**
 * @date 01/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This interface models the tools that the user can use for painting in the canvas
 */
public interface Tool {

    /**
     * ContinueDrawing. This method draws the modifications done by the chosen tool by the user while he/she 
     * drags the mouse but without saving them as final
     * @param xStart. Where the modification begins in the x axis
     * @param yStart. Where the modification begins in the y axis
     * @param xEnd. Where the modification ends in the x axis
     * @param yEnd. Where the modification ends in the y axis
     * @param g2. Where the modifications will be drawn
     * 
     * need to be overrided
     */
    
    public void continueDrawing(int xStart, int yStart, int xEnd, int yEnd, Graphics2D g2);
    
    /**
     * drawAll. This method draws all the final stored tools
     * @param g2. Where the modifications will be drawn 
     * 
     * needs to be overrided
     */
    public void drawAll(Graphics2D g2);
    
}
