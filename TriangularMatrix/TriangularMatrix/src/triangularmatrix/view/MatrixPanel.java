package triangularmatrix.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class MatrixPanel extends JPanel{
    public CellPanel[][] cellPanelArray;
    
    public MatrixPanel() {
        this.cellPanelArray = null;
    }
    
    public MatrixPanel(int matrixDimension) {

        this.cellPanelArray = new CellPanel[matrixDimension][matrixDimension];
        this.setLayout(new GridLayout(matrixDimension, matrixDimension));
        this.setPreferredSize(new Dimension(400,500));
        this.setBounds(50, 50, WIDTH, HEIGHT);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.initializeComponents(matrixDimension);
        
    }
    
    public MatrixPanel(int dimension1, int dimension2) {
        this.cellPanelArray = new CellPanel[dimension1][dimension2];
        this.setLayout(new GridLayout(dimension1, dimension2));
        this.setPreferredSize(new Dimension(400,500));
        this.initializeComponents(dimension1, dimension2);
    }
    
    public void initializeComponents(int matrixDimension) {
        for(int i=0; i<matrixDimension; i+=1) {
            for(int j=0; j<matrixDimension; j+=1) {
                this.cellPanelArray[i][j] = new CellPanel();
                this.add(cellPanelArray[i][j]);
            }
        }
    }
    
    public void initializeComponents(int dimension1, int dimension2){
        for(int i=0; i<dimension1; i+=1) {
            for(int j=0; j<dimension2; j+=1) {
                this.cellPanelArray[i][j] = new CellPanel();
                this.add(cellPanelArray[i][j]);
            }
        }
    }
    
}
