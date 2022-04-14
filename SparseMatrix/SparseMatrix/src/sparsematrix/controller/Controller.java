/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import sparsematrix.view.View;
import sparsematrix.model.Model;
/**
 *
 * @author Hoeco
 */
public class Controller implements ActionListener{
    View userInterface;
    Model sparseMatrix;
    
    public Controller(int n, int m) {
        this.userInterface = new View(n, m);
        this.sparseMatrix = new Model(n, m);
    }
    
    public void start() {
        // Add the actionListener to the buttons
        this.userInterface.centralPanel.submitButton.addActionListener(this);
        this.userInterface.centralPanel.reconstructMatrixButton.addActionListener(this);
    }
    
    public void handleSubmit() {
        System.out.println("Submit button pushed");
        this.userInterface.centralPanel.reconstructMatrixButton.setVisible(true);
    }
    
    public void handleReconstruction() {
        System.out.println("Reconstruction button pushed");
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
        switch (arg0.getActionCommand()) {
                case "Submit":
                    handleSubmit();
                    break;
                case "Reconstruct Matrix":
                    handleReconstruction();
                    break;
        }
    }
    
}
