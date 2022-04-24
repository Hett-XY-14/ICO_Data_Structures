/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author Hoeco
 */
public class View extends JFrame{
    private NorthPanel northPanel;
    private CentralPanel centralPanel;
    private VoidPanel southPanel;
    private VoidPanel eastPanel; 
    private VoidPanel westPanel;
    
    public View() {
        this.northPanel = new NorthPanel("Stack and Queue");
        this.centralPanel = new CentralPanel();
        this.southPanel = new VoidPanel();
        this.eastPanel = new VoidPanel();
        this.westPanel = new VoidPanel();
        
        initComponents();
    }
    
    public void initComponents() {
        this.add(this.northPanel, BorderLayout.NORTH);
        this.add(this.centralPanel, BorderLayout.CENTER);
        this.add(this.southPanel, BorderLayout.SOUTH);
        this.add(this.eastPanel, BorderLayout.EAST);
        this.add(this.westPanel, BorderLayout.WEST);
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
    
    public void setActionListener(ActionListener aL) {
        // Buttons in queuePanel
        this.centralPanel.getQueuePanel().getEnqueueButton().addActionListener(aL);
        this.centralPanel.getQueuePanel().getDequeueButton().addActionListener(aL);
        // Buttons in stackPanel
        this.centralPanel.getStackPanel().getEnqueueButton().addActionListener(aL);
        this.centralPanel.getStackPanel().getDequeueButton().addActionListener(aL);
    }

    public void actualizeCentralPanel(Object[] sequence, String type) {
        if ("stack".equals(type)){
            this.centralPanel.getStackPanel().setSequencePanel(sequence);
        } else if ("queue".equals(type)) {
            this.centralPanel.getQueuePanel().setSequencePanel(sequence);
        }
    }
    
    // Getters and Setters
    public NorthPanel getNorthPanel() {
        return northPanel;
    }

    public void setNorthPanel(NorthPanel northPanel) {
        this.northPanel = northPanel;
    }

    public CentralPanel getCentralPanel() {
        return centralPanel;
    }

    public void setCentralPanel(CentralPanel centralPanel) {
        this.centralPanel = centralPanel;
    }

    public VoidPanel getSouthPanel() {
        return southPanel;
    }

    public void setSouthPanel(VoidPanel southPanel) {
        this.southPanel = southPanel;
    }

    public VoidPanel getEastPanel() {
        return eastPanel;
    }

    public void setEastPanel(VoidPanel eastPanel) {
        this.eastPanel = eastPanel;
    }

    public VoidPanel getWestPanel() {
        return westPanel;
    }

    public void setWestPanel(VoidPanel westPanel) {
        this.westPanel = westPanel;
    }
    
    
}
