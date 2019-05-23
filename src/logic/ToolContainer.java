/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 07/may/2019
 * @authors Eva Beltran, Emilio Aguilera, Viviana Dueñas
 * Description: This class saves an array of tools for making serialization easier
 */
public class ToolContainer implements java.io.Serializable{
    //Array of tools that will be saved
    private List<Tool> tools;
    
     /**
     * ToolContainer. Constructor
     */
    public ToolContainer() {
        tools = new ArrayList();
    }
    
     /**
     * addTool. This method adds a tool to the array
     * @param tool. tool that will be added to the array
     */
    public void addTool(Tool tool){
        tools.add(tool);
    }
    
     /**
     * getTools. This method returns the array of tools that is saved in the class
     * @return: tools: the array of tools that is saved in this class
     */
    public List<Tool> getTools() {
        return tools;
    }
 }
