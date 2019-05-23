/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

//Imports needed
import java.io.*;
import javax.swing.ImageIcon;


/**
 * @date 07/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This class saves files for being reopened in this project
 */
public class fileWriter {
    
    /**
     * writeSerialization. This method serializes an object type ToolContainer and an ImageIcon 
     * @param name: name of the file
     * @param tools: ToolContainer, it contains all the modifications made by the user
     * @param icon: ImageIcon, it contains the image that was opened by the user. It can be null
     */
    public void writeSerialization(String name, ToolContainer tools, ImageIcon icon ) {
        try {
            //Opens or creates file
            FileOutputStream fileOut = new FileOutputStream(name + ".ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //Serializes the objects
            out.writeObject(icon);
            out.writeObject(tools);
            //Closes files
            out.close();
            fileOut.close();
            
      	} catch (IOException e) {
            e.printStackTrace();
      	}
    }
}
