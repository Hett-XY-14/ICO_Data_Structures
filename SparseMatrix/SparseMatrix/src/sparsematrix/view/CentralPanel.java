/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Hoeco
 */
public class CentralPanel extends JPanel{
    public MatrixPanel matrixPanel;
    public JButton submitButton;
    public JButton reconstructMatrixButton;
    
    public CentralPanel(int n, int m) {
        this.matrixPanel = new MatrixPanel(n,m);
        this.submitButton = new JButton("   Submit   ");
        this.reconstructMatrixButton = new JButton("   Reconstruct Matrix   ");
        initComponents();

    }

    public void initComponents(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBorder(new EmptyBorder(0,10,50,10));
        this.add(this.matrixPanel);
        this.add(this.submitButton);
        this.submitButton.setBorder(new EmptyBorder(20,100,20,100));
        this.submitButton.setHorizontalAlignment(SwingConstants.CENTER);
        this.submitButton.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 23));
        this.submitButton.setForeground(Color.WHITE);
        this.submitButton.setBackground(new Color(0x032500));
        this.submitButton.setPreferredSize(new Dimension(300,25));
        this.add(this.reconstructMatrixButton);
        this.reconstructMatrixButton.setBorder(new EmptyBorder(10,100,10,100));
        this.reconstructMatrixButton.setHorizontalAlignment(SwingConstants.CENTER);
        this.reconstructMatrixButton.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 23));
        this.reconstructMatrixButton.setForeground(Color.WHITE);
        this.reconstructMatrixButton.setBackground(new Color(0x032500));
        this.reconstructMatrixButton.setPreferredSize(new Dimension(300,25));
        this.reconstructMatrixButton.setVisible(false);
    }
    
}


