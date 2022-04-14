/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Hoeco
 */
public class MatrixPanel extends JPanel{
    JTextField[][] inputMatrix;
    
    public MatrixPanel(int n, int m) {
        this.inputMatrix = new JTextField[n][m];
        this.setLayout(new GridLayout(n,m,5,5));
        initComponents(n, m);
    }
    
    public void initComponents(int n, int m) {
        for(int i=0; i<n; i+=1) {
            for(int j=0; j<m; j+=1) {
               this.inputMatrix[i][j]= new JTextField();
               this.add(this.inputMatrix[i][j]);
            }
        }
    }
    
    public int[][] getValuesMatrix() {
        int rows = inputMatrix.length;
        int columns = inputMatrix[0].length;
        int[][] valuesMatrix = new int[rows][columns];
        
        for(int i=0; i<inputMatrix.length; i+=1) {
            for(int j=0; j<inputMatrix[i].length; j+=1) {
               valuesMatrix[i][j] = Integer.parseInt(this.inputMatrix[i][j].getText());
            }
        }
        
        return valuesMatrix;
    }
}
