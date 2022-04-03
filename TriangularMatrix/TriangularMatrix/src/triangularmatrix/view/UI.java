/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.view;

import triangularmatrix.view.InitialConditionsPanel;
import triangularmatrix.view.MatrixPanel;
import triangularmatrix.view.VoidPanel;
import triangularmatrix.view.InstructionPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class UI extends JFrame {
    public JPanel mainPanel;
    public JPanel northPanel;
    public EastPanel eastPanel;//<----------
    public InitialConditionsPanel initialConditionsPanel;
    public MatrixPanel matrixInputPanel;

    public int numberOfMatrices;
    public JPanel instructionsPanel;
    
    public UI() {
        this.mainPanel = new  JPanel();
        this.mainPanel.setLayout(new BorderLayout());
        this.northPanel = new JPanel();
        this.eastPanel = new EastPanel();
        this.initialConditionsPanel = new InitialConditionsPanel();
        this.matrixInputPanel = new MatrixPanel();
        this.numberOfMatrices = 0;
        this.instructionsPanel = new InstructionPanel();
        initializeComponents();
    }
    
    public void initializeComponents() {
        
        // Adding Components
// NORTH
        ClockPanel clock = new ClockPanel();
        this.northPanel.add(clock);
        TitlePanel title = new TitlePanel("    Matrices Triangulares    ");
        this.northPanel.add(title);
        DatePanel date = new DatePanel();
        this.northPanel.add(date);
        this.add(BorderLayout.NORTH, northPanel);        
// EAST
        this.add(BorderLayout.EAST, eastPanel);
// CENTER
        this.mainPanel.add(initialConditionsPanel, BorderLayout.CENTER);
        this.add(BorderLayout.CENTER,mainPanel);
        /////////////////////////// <-<-<-<-<-
        this.mainPanel.add(instructionsPanel, BorderLayout.NORTH);
        this.mainPanel.add(matrixInputPanel, BorderLayout.CENTER);
        
// WEST
        this.add(BorderLayout.WEST, new VoidPanel());
// SOUTH
        this.add(BorderLayout.SOUTH, new VoidPanel());
// UI Basic Configuration
        this.setSize(900,900);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
