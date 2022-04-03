/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import triangularmatrix.model.Model;

import triangularmatrix.view.*;

/**
 *
 * @author Hoeco
 */
public class Controller implements ActionListener{
    private UI view;
    private Model model;
    private int[][] userInputMatrix1;
    private int[][] userInputMatrix2;
    private int dimension;
    private int type1;
    private int type2;
    private int numberOfMatrix;
    private MatrixOutputPanel matrixOutputPanel;
    public Controller() {
        this.model = new Model();
        this.view = new UI();
        this.userInputMatrix1 = null;
        this.userInputMatrix2 = null;
        this.dimension = 0;
        this.type1= -1;
        this.type2= -1;
        this.numberOfMatrix = 1;
        this.matrixOutputPanel = null;
        
        loadComponents();
    }
    
    public void loadComponents() {
        this.view.eastPanel.storeMatrixButton.addActionListener(this);
        this.view.initialConditionsPanel.sizeInput.addActionListener(this);
        this.view.eastPanel.upperMatrixButton.addActionListener(this);
        this.view.eastPanel.lowerMatrixButton.addActionListener(this);
        this.view.initialConditionsPanel.generateMatrix.addActionListener(this);
        this.view.initialConditionsPanel.setVisible(true);
        this.view.matrixInputPanel.setVisible(false);
        this.view.eastPanel.setVisible(false);
    }
    
    public void write(String word) {
        System.out.println(word);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
        switch (arg0.getActionCommand()){
            case "Generate Matrix": generateMatrix();
                break;
            case "Store Matrix": storeMatrix();
                break;
        }
        
    }
    
    public void handleToggleButton() {
        
    }
    
    public void generateMatrix() {
        
        // Save the dimension of the matrix into dimension attribute
        this.dimension = parseInt(this.view.initialConditionsPanel.sizeInput.getText());
        System.out.println("dimension: "+ dimension);
        this.view.matrixInputPanel = new MatrixPanel(this.dimension);
        this.view.mainPanel.remove(this.view.matrixInputPanel);
        this.view.mainPanel.add(this.view.matrixInputPanel);
        manageViewChanges(1);
        this.view.setSize(700,600);
    }
    
    public void storeMatrix() {
        // Save the type of matrix into the type attribute
        
        switch(this.numberOfMatrix) {
            case 1:
                storeMatrix1();
                break;
            case 2:
                storeMatrix2();
                break;
            }
    }
    
    public void storeMatrix1() {
        if (this.view.eastPanel.upperMatrixButton.isSelected()) {
            this.type1 = 1;
        } else {
            this.type1 = 0;
        }
        this.userInputMatrix1 = new int[this.dimension][this.dimension];

        for(int i=0; i<this.dimension; i+=1){
            for(int j=0; j<this.dimension; j+=1){
                this.userInputMatrix1[i][j] = parseInt(this.view.matrixInputPanel.cellPanelArray[i][j].userInputField.getText());
            }
        }
        this.model.setMatrixOne(this.userInputMatrix1, this.type1);
        this.numberOfMatrix +=1;
        
        for(int i=0; i<this.dimension; i+=1){
            for(int j=0; j<this.dimension; j+=1){
                this.view.matrixInputPanel.cellPanelArray[i][j].userInputField.setText("");
            }
        }
    }
    
    public void storeMatrix2() {
        if (this.view.eastPanel.upperMatrixButton.isSelected()) {
            this.type2 = 1;
        } else {
            this.type2 = 0;
        }
        
        this.userInputMatrix2 = new int[this.dimension][this.dimension];
        for(int i=0; i<this.dimension; i+=1){
            for(int j=0; j<this.dimension; j+=1){
                this.userInputMatrix2[i][j] = parseInt(this.view.matrixInputPanel.cellPanelArray[i][j].userInputField.getText());
            }
        }
        
        this.model.setMatrixTwo(this.userInputMatrix2, this.type2);
        this.model.combineMatrices();
        manageViewChanges(2);
    }
    
    public void manageViewChanges(int phase) {
        switch(phase) {
            case 1:
                this.view.initialConditionsPanel.setVisible(false);
                this.view.matrixInputPanel.setVisible(true);
                this.view.eastPanel.setVisible(true);
                break;
            case 2:
                this.view.matrixInputPanel.setVisible(false);
                this.view.eastPanel.typeOfMatrixPanel.setVisible(false);
                this.view.eastPanel.storeMatrixButtonPanel.setVisible(false);
                this.view.eastPanel.typeLabel.setVisible(false);
                this.view.setSize(600,950);
                showMatrices();
        }
    }
    
    public void showMatrices() {
        int[][] m1 = this.model.matrixOne.innerMatrix;
        int t1 = this.model.matrixOne.type;
        int[][] m2 = this.model.matrixTwo.innerMatrix;
        int t2 = this.model.matrixTwo.type;
        int[][] cm = this.model.combinedMatrix.innerMatrix;
        this.matrixOutputPanel = new MatrixOutputPanel(m1, t1, m2, t2, cm);
        this.view.mainPanel.add(this.matrixOutputPanel);
    }
}
