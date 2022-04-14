/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class CentralPanel extends JPanel{
    public JPanel matrixPanel;
    public JButton submitButton;
    public JButton reconstructMatrixButton;
    
    public CentralPanel(int n, int m) {
        this.matrixPanel = new MatrixPanel(n,m);
        this.submitButton = new JButton("Submit");
        this.reconstructMatrixButton = new JButton("Reconstruct Matrix");
        initComponents();

    }

    public void initComponents(){
        this.add(this.matrixPanel);
        this.add(this.submitButton);
        this.add(this.reconstructMatrixButton);
        this.reconstructMatrixButton.setVisible(false);
    }
    
}


