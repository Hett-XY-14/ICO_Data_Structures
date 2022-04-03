/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.view;

import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class NorthPanel extends JPanel{
    public ClockPanel clock;
    public TitlePanel title;
    public DatePanel date;
    
    // Constructor
    public NorthPanel() {
        this.clock = new ClockPanel();
        this.title = new TitlePanel("Circular Queue");
        this.date = new DatePanel();
        initComponents();
    }
    
    public void initComponents() {
        this.add(this.clock);
        this.add(this.title);
        this.add(this.date);
    }
    
}
