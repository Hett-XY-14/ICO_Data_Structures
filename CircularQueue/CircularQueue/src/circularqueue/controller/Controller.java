/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import stackandqueue.Model.Queue;
import stackandqueue.Model.Stack;
import stackandqueue.view.View;

/**
 *
 * @author Hoeco
 * 
 */
public class Controller implements ActionListener{
    private View userInterface;
    private Stack stack;
    private Queue queue;
    
    public Controller() {
        this.userInterface = new View();
        this.stack = new Stack();
        this.queue = new Queue();
        
        start();
    }
    
    public void start(){
        this.userInterface.setActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("Action Received");
        System.out.println(arg0.getActionCommand());
        Object stackInput = this.userInterface.getCentralPanel().getStackPanel().getUserInput().getText();
        Object queueInput = this.userInterface.getCentralPanel().getQueuePanel().getUserInput().getText();
        
        switch(arg0.getActionCommand()) {
            case " Push ":
                handleStackPush(stackInput);
                break;
            case " Pop ":
                handleStackPop();
                break;
            case " Enqueue ":
                handleQueueEnqueue(queueInput);
                break;
            case " Dequeue ":
                handleQueueDequeue();
                break;
        }
    }
    
    public void handleStackPush(Object stackInput) {
        System.out.println("1");
        this.stack.push(stackInput);
        Object[] sequence = this.stack.returnElements();
        this.userInterface.actualizeCentralPanel(sequence, "stack");
    }
    
    public void handleStackPop() {
        System.out.println("2");
        this.stack.pop();
        Object[] sequence = this.stack.returnElements();
        this.userInterface.actualizeCentralPanel(sequence, "stack");
    }
    
    public void handleQueueEnqueue(Object queueInput) {
        System.out.println(queueInput);
        this.queue.enqueue(queueInput);
        Object[] sequence = this.queue.returnElements();
        this.userInterface.actualizeCentralPanel(sequence, "queue");
    }
    
    public void handleQueueDequeue() {
        System.out.println("4");
        this.queue.dequeue();
        Object[] sequence = this.queue.returnElements();
        this.userInterface.actualizeCentralPanel(sequence, "queue");
    }
}
