/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.view;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Hoeco
 */
public class EastPanel extends JPanel{
    public JButton storeMatrixButton;//<---------
    public JPanel storeMatrixButtonPanel;//<--------
    
    public JLabel typeLabel;//////////////
    public JPanel typeOfMatrixPanel;///////////////
    public ButtonGroup typeOfMatrixGroup;///////////
    public JRadioButton upperMatrixButton;//////////
    public JRadioButton lowerMatrixButton;////////////////
    
    public EastPanel() {
        this.setLayout(new BorderLayout());
        
        this.storeMatrixButtonPanel= new JPanel();//<-----
        this.storeMatrixButton = new JButton("Store Matrix");//<------
        this.storeMatrixButtonPanel.add(storeMatrixButton);

        this.typeOfMatrixPanel = new JPanel();
        this.typeLabel = new JLabel("<html><h2>Tipo de matriz a introducir: <h2><html>");
        this.upperMatrixButton = new JRadioButton("<html><h1>Upper<h1><html>");
        this.lowerMatrixButton = new JRadioButton("<html><h1>Lower<h1><html>");
        this.lowerMatrixButton.setSelected(true);
        this.typeOfMatrixGroup = new ButtonGroup();
        typeOfMatrixGroup.add(upperMatrixButton);
        typeOfMatrixGroup.add(lowerMatrixButton);
        this.typeOfMatrixPanel.add(upperMatrixButton);
        this.typeOfMatrixPanel.add(lowerMatrixButton);
        
        this.add(BorderLayout.NORTH,typeLabel);/////
        this.add(BorderLayout.CENTER,typeOfMatrixPanel);//////////
        this.add(BorderLayout.SOUTH, storeMatrixButtonPanel);
        this.add(BorderLayout.EAST, new VoidPanel());
        this.add(BorderLayout.WEST, new VoidPanel());
    }
    
}
