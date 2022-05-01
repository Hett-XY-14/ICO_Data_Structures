/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import circularqueue.model.CircularQueue;
import circularqueue.view.View;
/**
 *
 * @author Hoeco
 * 
 */
public class Controller implements ActionListener{
    private View userInterface;
    private CircularQueue circularQueue;
    
    
    public Controller(int n) {
        this.userInterface = new View();
        this.circularQueue = new CircularQueue(n);
        
        start();
    }
    
    public void start(){
        this.userInterface.setActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("Action Received");
        System.out.println(arg0.getActionCommand());
        Object queueInput = this.userInterface.getCentralPanel().getQueuePanel().getUserInput().getText();
        
        switch(arg0.getActionCommand()) {
            case " Enqueue ":
                handleQueueEnqueue(queueInput);
                break;
            case " Dequeue ":
                handleQueueDequeue();
                break;
        }
    }
    
    public void handleQueueEnqueue(Object queueInput) {
        System.out.println(queueInput);
        if (this.circularQueue.isFull()) {
            System.out.println("full");
            boundsLimitException("Full");
        } else {
            this.circularQueue.enQueue(queueInput);
            Object[] sequence = this.circularQueue.getInnerArray();
            this.userInterface.actualizeCentralPanel(sequence);
        }
    }
    
    public void handleQueueDequeue() {
        System.out.println("4");
        if (this.circularQueue.isEmpty()) {
            System.out.println("empty");
            boundsLimitException("Empty");
        } else {
            this.circularQueue.deQueue();
            Object[] sequence = this.circularQueue.getInnerArray();
            this.userInterface.actualizeCentralPanel(sequence);
        }
    }
    
    public void boundsLimitException(String state) {
        this.userInterface.actualizeCentralPanel(state);
    }
}
