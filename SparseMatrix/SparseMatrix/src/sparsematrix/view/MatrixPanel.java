/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Hoeco
 */
public class MatrixPanel extends JPanel{
    public JTextField[][] inputMatrix;
    public JLabel[][] outputMatrix;
    
    public MatrixPanel(int n, int m) {
        this.inputMatrix = new JTextField[n][m];
        this.setLayout(new GridLayout(n,m,15,15));
        this.setBorder(new EmptyBorder(60,50,30,50));
        this.outputMatrix = new JLabel[n][m];
        initComponents(n, m);
    }
    
    public void initComponents(int n, int m) {
        for(int i=0; i<n; i+=1) {
            for(int j=0; j<m; j+=1) {
               this.inputMatrix[i][j]= new JTextField(1);
               this.inputMatrix[i][j].setBackground(new Color(160,160,160));
               this.inputMatrix[i][j].setFont(new Font(Font.MONOSPACED, Font.PLAIN, 23));   
               this.inputMatrix[i][j].setHorizontalAlignment(SwingConstants.CENTER);                
               this.inputMatrix[i][j].setBorder(new EmptyBorder(1,1,1,1));
               this.add(this.inputMatrix[i][j]);
            }
        }
    }
    
    public void reconstructMatrix(int [][] matrix) {
        this.removeAll();
        
        for (int i=0; i<matrix.length; i+=1) {
            for (int j=0; j<matrix[i].length; j+=1) {
                this.outputMatrix[i][j] = new JLabel(Integer.toString(matrix[i][j]));
                this.outputMatrix[i][j].setFont(new Font(Font.MONOSPACED, Font.PLAIN, 23));
                this.outputMatrix[i][j].setOpaque(true);
                this.outputMatrix[i][j].setBackground(new Color(160,160,160));
                this.outputMatrix[i][j].setHorizontalAlignment(SwingConstants.CENTER);
                this.add(outputMatrix[i][j]);
                
            }
        }
    }
}
