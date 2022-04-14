/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import sparsematrix.view.View;
import sparsematrix.model.Model;
/**
 *
 * @author Hoeco
 */
public class Controller implements ActionListener{
    View userInterface;
    Model sparseMatrix;
    int rows;
    int columns;
    
    public Controller(int n, int m) {
        this.userInterface = new View(n, m);
        this.sparseMatrix = new Model(n, m);
        this.rows = n;
        this.columns = m;
    }
    
    public void start() {
        // Add the actionListener to the buttons
        this.userInterface.centralPanel.submitButton.addActionListener(this);
        this.userInterface.centralPanel.reconstructMatrixButton.addActionListener(this);
    }
    
    public void handleSubmit() {
        System.out.println("Submit button pushed");        
        int[][] valuesMatrix = getValuesFromView();
        this.sparseMatrix.storeMatrix(valuesMatrix);
        changeVisibility();
        
    }
    
    public void handleReconstruction() {
        System.out.println("Reconstruction button pushed");
        int [][] reconstructed = this.sparseMatrix.reconstructMatrix();
        this.userInterface.centralPanel.matrixPanel.reconstructMatrix(reconstructed);
        this.userInterface.centralPanel.matrixPanel.setVisible(true);
        this.userInterface.centralPanel.reconstructMatrixButton.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
        switch (arg0.getActionCommand()) {
                case "   Submit   ":
                    handleSubmit();
                    break;
                case "   Reconstruct Matrix   ":
                    handleReconstruction();
                    break;
        }
    }
    
    public int[][] getValuesFromView() {
        int[][] values = new int[this.rows][this.columns];
        
        for(int i=0; i<rows; i+=1) {
            for(int j=0; j<columns; j+=1){
                values[i][j] = Integer.parseInt(this.userInterface.centralPanel.matrixPanel.inputMatrix[i][j].getText());
                this.userInterface.centralPanel.matrixPanel.inputMatrix[i][j].setText("");
            }
        }
        return values;
    }
    
    public void changeVisibility() {
        this.userInterface.centralPanel.reconstructMatrixButton.setVisible(true);
        this.userInterface.centralPanel.submitButton.setVisible(false);
        this.userInterface.centralPanel.matrixPanel.setVisible(false);
    }
}
