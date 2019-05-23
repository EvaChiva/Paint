/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

//import libraries
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;


/**
 * @date 01/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This class models a tool that colors while following the mouse
 * It is serializable
 */
public abstract class lineTool implements Tool, java.io.Serializable{
    //Attributtes for line
    protected Color color;

    protected Line2D smallLine;
    private Graphics2D g2;
    private List<Line2D> lines = new ArrayList();
    
    /**
     * Continue drawing. This method draws the modifications done by the chosen tool by the user while he/she 
     * drags the mouse but without saving them as final
     * @param xStart: where the line begins in x axis
     * @param yStart: where the line begins in y axis
     * @param xEnd: where the line ends in x axis
     * @param yEnd: where the line ends in y axis
     * @param g2: Graphics2D where lines are being drawn
     */
    @Override
    public void continueDrawing(int xStart, int yStart, int xEnd, int yEnd, Graphics2D g2) {
        
        g2.setColor(color);
        g2.setStroke(new BasicStroke(5));
        smallLine = new Line2D.Double((double)xStart, (double)yStart, (double)xEnd, (double)yEnd);
        lines.add(smallLine);
        //Draws all the lines that are being drawn by the user
        for(int i = 0; i < lines.size(); i++) {
            g2.draw(lines.get(i));
        }  
    }
    
    /**
     * drawAll. This method draws all the small lines that compose the larger line
     * @param g2: Graphics2D where lines are being drawn
     */
    @Override
    public void drawAll(Graphics2D g2) {
        //Draws all the small lines in the array
        for(int i=0; i < lines.size(); i++){
            g2.draw(lines.get(i));
        }  
    }

    
}
