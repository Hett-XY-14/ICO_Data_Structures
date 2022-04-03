/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.view;

import java.awt.GridLayout;
import javax.swing.JPanel;


/**
 *
 * @author Hoeco
 */
public class MatrixOutputPanel extends JPanel{
    public MatrixPanel matrixOneOutputPanel;
    public MatrixPanel matrixTwoOutputPanel;
    public MatrixPanel combinedMatrixOutputPanel;
    public int[][] matrixOne;
    public int type1;
    public int[][] matrixTwo;
    public int type2;
    public int[][] combinedMatrix;
    
    public MatrixOutputPanel() {
        this.matrixOneOutputPanel = new MatrixPanel();
        this.matrixTwoOutputPanel = new MatrixPanel();
        this.combinedMatrixOutputPanel = new MatrixPanel();
        this.matrixOne = null;
        this.type1 = -1;
        this.matrixTwo = null;
        this.type2 = -1;
        this.combinedMatrix = null;
        
    }
    
    public MatrixOutputPanel(int[][] m1, int t1, int[][] m2, int t2, int[][] cm) {
        this.matrixOneOutputPanel = new MatrixPanel(m1.length);
        this.matrixTwoOutputPanel = new MatrixPanel(m2.length);
        this.combinedMatrixOutputPanel = new MatrixPanel(cm.length,cm[0].length);
        this.matrixOne = m1;
        this.type1 = t1;
        this.matrixTwo = m2;
        this.type2 = t2;
        this.combinedMatrix = cm;
        initializeComponents();
    }
    
    public void initializeComponents() {
        this.setLayout(new GridLayout(3,1));
        setValues(matrixOne, matrixOneOutputPanel);
        setValues(matrixTwo, matrixTwoOutputPanel);
        setValues(combinedMatrix, combinedMatrixOutputPanel);
        this.add(matrixOneOutputPanel);
        this.add(matrixTwoOutputPanel);
        this.add(combinedMatrixOutputPanel);
    }
    
    public void setValues(int[][] m, MatrixPanel mpanel){
        for(int i=0; i<m.length; i+=1){
            for(int j=0; j<m[i].length; j+=1){
                mpanel.cellPanelArray[i][j].cellDataLabel.setText(Integer.toString(m[i][j]));
                mpanel.cellPanelArray[i][j].cellDataLabel.setVisible(true);
                //mpanel.actualizeMatrixPanel();
                mpanel.cellPanelArray[i][j].userInputField.setVisible(false);
            }
        }
    }
    
}
