/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class View extends JFrame {
    public JPanel mainPanel;
    public NorthPanel northPanel;
    public CentralPanel centralPanel;
    public VoidPanel southPanel;
    public VoidPanel eastPanel;
    public VoidPanel westPanel;
    
    public View(int n, int m) {
        this.mainPanel = new JPanel();
        this.northPanel = new NorthPanel();
        this.centralPanel = new CentralPanel(n, m);
        this.southPanel = new VoidPanel();
        this.eastPanel = new VoidPanel();
        this.westPanel = new VoidPanel();
        
        initComponents();
    }
    
    public void initComponents() {
        this.add(BorderLayout.NORTH, this.northPanel);
        this.add(BorderLayout.CENTER, this.centralPanel);
        this.add(BorderLayout.SOUTH, this.southPanel);
        this.add(BorderLayout.EAST, this.eastPanel);
        this.add(BorderLayout.WEST, this.westPanel);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
