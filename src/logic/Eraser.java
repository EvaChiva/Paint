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
 * Description: This class models an eraser
 */
public class Eraser extends lineTool{
    public Eraser (){
        color = Color.WHITE;
    }
    
     /**
     * drawAll. This method draws all the final stored small white lines 
     * @param g2. Graphics2D where the pen appears
     */
    @Override
     public void drawAll(Graphics2D g2) {
        g2.setColor(color);
        super.drawAll(g2);
    }
}
