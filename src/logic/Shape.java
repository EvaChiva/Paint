/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * @date 01/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This abstract class models a determined shape
 * It is serializable
 */
public abstract class Shape implements Tool, java.io.Serializable{
    //Attributes
    protected Graphics2D g2;
    protected int xStart;
    protected int yStart;
    protected Color color;
    
    /**
     * finishDrawing. This method saves the shape that the user defined as their final decision
     * @param xEnd: where the shape ends in x axis
     * @param yEnd: where the shape ends in y axis
     * @param g2: Graphics2D where squares are being drawn
     */
    public abstract void finishDrawing(int xEnd, int yEnd, Graphics2D g2);
     
    /**
      * setColor. This method sets the color the shape will have
      * @param newColor 
      */
    public void setColor(Color newColor) {
        color = newColor;
    }
    
    /**
     * getColor. This method gets the current color
     * @return color
     */
    public Color getColor() {
        return color;
    }
    
}
