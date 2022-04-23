/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view;

import javax.swing.BoxLayout;
import stackandqueue.view.centralpanelcomponents.DequePanel;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class CentralPanel extends JPanel{
    private final DequePanel stackPanel;
    private final DequePanel queuePanel;
    
    public CentralPanel() {
        this.stackPanel = new DequePanel(" Stack ", " Push ", " Pop ");
        this.queuePanel = new DequePanel(" Queue ", " Enqueue ", " Dequeue ");
        
        initComponents();
    }
    
    public void initComponents() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(this.stackPanel);
        this.add(this.queuePanel);
    }
    
    // Getters
    public DequePanel getStackPanel() {
        return this.stackPanel;
    }
    
    public DequePanel getQueuePanel() {
        return this.queuePanel;
    }
    
}
