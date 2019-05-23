/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 * @date 07/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This class retrieves the objects from a .ser file for continue drawing in them
 */
public class FileReaderSer {
    
    /**
     * readIconSerialization. This method returns the saved image in the file (can be null)
     * @param name. Name of the file
     * @return icon. The image in the file
     */
    public ImageIcon readIconSerialization(String name) {
        ImageIcon icon = null;
    	try {
            //Opens file
            FileInputStream fileIn = new FileInputStream(name + ".ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            //Retrieves object
            icon = (ImageIcon) in.readObject();
            //Closes files
            in.close();
            fileIn.close();
     	
            //Catches the errors
      	
        } catch (ClassNotFoundException c) {
        	System.out.println("Class not found");
     		c.printStackTrace();
     		
        }catch(FileNotFoundException exception){
            return null;
         } catch (IOException ex) {
            Logger.getLogger(FileReaderSer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return icon;
    }
    
    /**
     * readToolSerialization. This method returns the saved tools in the file (can be null)
     * @param name: name of the file
     * @return tools. Tools stored in file
     */
    public ToolContainer readToolSerialization(String name) {
        ImageIcon icon = null;
        ToolContainer tools = null;
    	try {
    		//Opens file
    		FileInputStream fileIn = new FileInputStream(name + ".ser");
     		ObjectInputStream in = new ObjectInputStream(fileIn);
     		//Retrieves object
       		icon = (ImageIcon) in.readObject();
                tools = (ToolContainer) in.readObject();
       		//Closes files
    		in.close();
    		fileIn.close();
     	
     	//Catches the errors
      	}catch(FileNotFoundException exception){
            return null;
        } catch (IOException e) {
      		e.printStackTrace();
    			
        }catch (ClassNotFoundException c) {
            System.out.println("Library class not found");
     		c.printStackTrace();
     		
 	}
        //returns saved tools
        return tools;
    }
}
