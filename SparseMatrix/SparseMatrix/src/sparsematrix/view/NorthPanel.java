/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public final class NorthPanel extends JPanel{
    public ClockPanel clock;
    public TitlePanel title;
    public DatePanel date;
    
    public NorthPanel() {
        this.clock = new ClockPanel();
        this.title = new TitlePanel("Sparse Matrix");
        this.date = new DatePanel();
        
        initComponents();
    }
    
    public void initComponents() {
        this.setOpaque(true);
        this.setBackground(new Color(160,160,160));
        this.add(this.clock);
        this.add(this.title);
        this.add(this.date);
    }
}
