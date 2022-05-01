/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.view;

import javax.swing.BoxLayout;
import circularqueue.view.centralpanelcomponents.DequePanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Hoeco
 */
public class CentralPanel extends JPanel{
    private JLabel warning;
    private final DequePanel queuePanel;
    
    public CentralPanel() {
        this.queuePanel = new DequePanel("Circular Queue ", " Enqueue ", " Dequeue ");
        this.warning = new JLabel("               ");
        initComponents();
    }
    
    public void initComponents() {
        this.add(this.warning);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(this.queuePanel);
    }
    
    // Getters
    
    public DequePanel getQueuePanel() {
        return this.queuePanel;
    }
    
    public void setSequencePanel(Object[] sequence) {
        this.queuePanel.setSequencePanel(sequence);
        
    }
    
    public void showWarning(String state) {
        this.queuePanel.showWarning(state);
    }
}
