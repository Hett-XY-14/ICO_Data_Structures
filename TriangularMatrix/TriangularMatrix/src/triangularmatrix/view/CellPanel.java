/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Hoeco
 */
public class CellPanel extends JPanel{
    public JTextField userInputField;
    public JLabel cellDataLabel;
    public JPanel contentPanel;
    public CellPanel() {
        this.setLayout(new BorderLayout());
        this.contentPanel = new JPanel();
        this.userInputField = new JTextField();
        this.userInputField.setPreferredSize(new Dimension(60,60));
        this.cellDataLabel = new JLabel("");
        this.cellDataLabel.setFont(new Font("Sans_Serif", Font.CENTER_BASELINE, 18));
        this.cellDataLabel.setVisible(false);
        this.setBackground(Color.gray);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        this.contentPanel.add(cellDataLabel);
        this.contentPanel.add(userInputField);
        this.add(BorderLayout.CENTER,contentPanel);
    }
    
}
