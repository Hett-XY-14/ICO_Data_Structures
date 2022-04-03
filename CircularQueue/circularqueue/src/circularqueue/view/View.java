/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.view;

import javax.swing.JFrame;

/**
 *
 * @author Hoeco
 */
public class View /* the class view has to extends the JFrame class */ extends JFrame{
    /*
        The class view represents the user interface, it should contain all the elements contained in the UI
        You can consult the wireframe at: https://www.figma.com/file/jv3cwHC2Cu9BtaXLHJd1e5/Untitled?node-id=0%3A1 
        (sign in with victorvivar315@aragon.unam.mx)
    
        The first part is declaring all the elements the user interface will contain 
        As you can see in the wireframe or in the UML diagram this  class has two attributes:    
    */ 
    // 1) northPanel (Containing the Clock, Title and Date) It's already done.
    public NorthPanel northPanel;
    
    // 2) centralPanel (It is the main panel, in which, all the other elements from the graphic interface will be attached to.
    // *** DECLARE THE centralPanel HERE ***
    
    // Constructor
    public View(int size) {
    /* ***  
            this is the constructor, it tells how to "construct" an object of certain class.
        
            INSTANTIATE A NEW NORTHPANEL OBJECT AND STORE IT IN THE northPanel ATTRIBUTE
            INSTANTIATE A NEW CENTRALPANEL OBJECT PASSING "size" AS THE ARGUMENT FOR THE CONSTRUCTOR AND STORE IT IN THE centralPanel ATTRIBUTE
    ***  */
    
    // Here we call the initComponents() method to initialize all the basic configuration
    this.initComponents();
    }
    
    public void initComponents() {
    
        /** DECLARE THE init METHOD, IT SHOULD GET ALL THE COMPONENTS AND UI CONFIGURATION READY:
            ADD northPanel AND centralPanel TO THE JFrame View (USE "this")
            SET THE SIZE OF THE VIEW (LOOK AT THE WIREFRAME FOR REFERENCE)
            SET THE VIEW STARTING LOCATION RELATIVE TO NOTHING  (look at JFrame.setLocationRelativeTo() for reference)
            SET THE VIEW AS VISIBLE (look at JFrame.setVisible() for reference)
            
        **/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This ends the subprocess when the JFrame is closed
    }
}