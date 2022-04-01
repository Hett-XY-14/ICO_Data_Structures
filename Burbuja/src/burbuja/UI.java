/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burbuja;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Hoeco
 */
public class UI extends JFrame{
    public JPanel centralPanel;
    public JLabel instructions;
    public JButton startButton;
    public JTextField userInput;
    public OutputPanel outputPanel;
    public JPanel northPanel;
    public ClockPanel clock;
    public TitlePanel title;
    public DatePanel date;
    public VoidPanel southPanel;
    public VoidPanel eastPanel;
    public VoidPanel westPanel;
    
    public UI () {
        this.northPanel = new JPanel();
        this.clock = new ClockPanel();
        this.title = new TitlePanel("Ordenamiento Burbuja");
        this.date = new DatePanel();
        
        this.centralPanel = new JPanel();
        this.startButton = new JButton("Start");
        this.instructions = new JLabel("<html><h1>Por favor introduzca elementos del array<h1><html>");
        this.userInput = new JTextField();
        this.outputPanel = new OutputPanel();
        this.outputPanel.setVisible(false);
        
        this.southPanel = new VoidPanel();
        this.southPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 300));
        this.eastPanel = new VoidPanel();
        this.westPanel = new VoidPanel();
        loadComponents();
        this.setSize(600, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void loadComponents() {
        // Clock, Title and Date
        this.northPanel.add(clock);
        this.northPanel.add(title);
        this.northPanel.add(date);
        
        this.add(BorderLayout.NORTH,northPanel);
        
        // Instructions and User Input
        this.centralPanel.setLayout(new BoxLayout(this.centralPanel, BoxLayout.Y_AXIS));
        this.centralPanel.add(instructions);
        this.centralPanel.add(startButton);
        this.centralPanel.add(userInput);
        this.centralPanel.add(outputPanel);
        this.userInput.setVisible(false);
        this.userInput.setSize(200, 30);
        this.centralPanel.add(new VoidPanel());
        
        this.add(centralPanel, BorderLayout.CENTER);
        
        // The rest of panels (void panels)
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(eastPanel, BorderLayout.EAST);
    }
}
