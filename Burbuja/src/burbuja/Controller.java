/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burbuja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hoeco
 */
public class Controller implements ActionListener{
    int arrLength;
    int currentElement;
    int[] arr;
    int[] orderedArr;
    UI view;
    
    public Controller(int arrLength) {
        this.currentElement=0;
        this.arrLength = arrLength;
        this.arr = new int[arrLength];
        this.orderedArr = null;
        this.view = new UI();
        this.view.startButton.addActionListener(this);
        this.view.userInput.addActionListener(this);
        this.loadComponents();
    }
    
    public void loadComponents() {
    }
    /*
    public int[] getUserInput() {
        int[] array = new int[arrLength];
        
        for(int i=0; i<this.arr.length; i+=1) {
            array[i] = this.view.getUserInput(i);
        }
        
        return array;
    }
    */
    //Método burbuja
    public int[] bubbleSort(int[] arr) {
        int aux = 0;
        int[] newArr = arr.clone();
        for(int i=0;i<(newArr.length-1);i++){
            for(int j=0;j<(newArr.length-1);j++){
                if(newArr[j]>newArr[j+1]){
                    aux = newArr[j];
                    newArr[j] = newArr[j+1];
                    newArr[j+1] = aux;
                }
            }
        }
        return newArr;
    }

    // Se muestra el arreglo ya ordenado de manera creciente
    public void showOutput(int[] unordered, int[] ordered){
        this.view.userInput.setVisible(false);
        this.view.instructions.setText("<html><h1>Aquí están los arrays<h1><html>");
        this.view.outputPanel.showMatrices(unordered, ordered);
        this.view.outputPanel.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
            if(arg0.getActionCommand().equals("Start")){
                this.view.userInput.setVisible(true);
                this.view.startButton.setVisible(false);                                
                this.view.instructions.setText("<html><h2>Enter the "+(currentElement+1)+" element in the array<h2><html>");
            } else {
                this.view.userInput.setText("");
                this.arr[currentElement] = Integer.parseInt(arg0.getActionCommand());
                this.currentElement +=1;
                this.view.instructions.setText("<html><h2>Enter the "+(currentElement+1)+" element in the array<h2><html>");
                
                if(this.currentElement >= this.arr.length){
                    this.orderedArr= bubbleSort(this.arr);
                    this.showOutput(this.arr, this.orderedArr);
                }
            }
            
            
    }
    
}
