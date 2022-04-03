/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.controller;
import circularqueue.model.CircularQueue;
import circularqueue.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Hoeco
 */
public class Controller implements ActionListener{

    private View userInterface;
    private CircularQueue circularQueue;
    
    public Controller(int size) {
        /*
        this.userInterface = new View(size);
        this.circularQueue = new CircularQueue(size);
        initComponents();
        */
    }
    
    public void initComponents() {
        /*
        this.userInterface.centralPanel.enQueueButton.addActionListener(this);
        this.userInterface.centralPanel.deQueueButton.addActionListener(this);
        */
        
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "enQueueButton":
                //this.handleEnQueue();
                System.out.println("enqueue button pressed");
                break;
            case "deQueueButton":
                //this.handleDeQueue();
                System.out.println("enqueue button pressed");
                break;
        }
        
        System.out.println("button clicked");
    }
    
    public void handleEnQueue() {
        /*
        int newNumber = this.userInterface.centralPanel.userInput.getText().;
        this.circularQueue.enqueue(new newNumber);
        int[] actualizedArray = this.circularQueue.getInnerArray();
        this.userInterface.centralPanel.arrayPanel.actualizeArray(actualizedArray);
        */
    }
    
    public void handleDeQueue() {
        /*
        int deQueued = this.circularQueue.deQueue();
        int[] actualizedArray = this.circularQueue.getInnerArray();
        this.userInterface.centralPanel.arrayPanel.actualizeArray(actualizedArray);
        */
    }
}
