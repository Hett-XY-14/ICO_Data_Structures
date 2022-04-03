/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.view;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Hoeco
 */
public class InitialConditionsPanel extends JPanel{
    public JLabel instructions;
    public JLabel sizeLabel;
    public JTextField sizeInput;

    public JButton generateMatrix;
    public JPanel instructionPanel;
    public JPanel dimensionPanel;
    
    public InitialConditionsPanel() {
        //Basic config
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //this.setBackground(Color.lightGray);
        this.setSize(800,700);
        //Basic config

        //Instructions
        this.instructionPanel = new JPanel();
        this.instructions = new JLabel("<html><h1>Bienvenido.<h1><br><h2>Este programa fue creado para permitir al usuario introducir<br>"
                + "dos matrices triangulares y almacenarlas de manera eficiente.<br><br>"
                + "Es necesario que las matrices a introducir sean cuadradas,<br>es decir nxm donde n=m<h2><html>");
        this.instructionPanel.add(instructions);
        
        // Matrix dimension
        this.dimensionPanel = new JPanel();
        this.sizeLabel = new JLabel("<html><h2>Dimensión de la matriz a introducir (n): <h2><html>");
        this.sizeInput = new JTextField();
        this.sizeInput.setPreferredSize(new Dimension(80,20));
        this.dimensionPanel.add(sizeLabel);
        this.dimensionPanel.add(sizeInput);
        
        // Generate matrix
        this.generateMatrix = new JButton("Generate Matrix");
        
        this.add(instructionPanel);
        this.add(dimensionPanel);
        this.add(generateMatrix);
    }
    
    public void loadComponents(){
        
    }
}
