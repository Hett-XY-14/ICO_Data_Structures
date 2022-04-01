/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burbuja;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class OutputPanel extends JPanel{
    public JPanel arrayOnePanel;
    public JPanel arrayTwoPanel;
    
    public OutputPanel() {
        this.arrayOnePanel = new JPanel();
        this.arrayTwoPanel = new JPanel();
        this.setLayout(new GridLayout(2,1,5,5));
        this.add(arrayOnePanel);
        this.add(arrayTwoPanel);
    }
    
    public void showMatrices(int[] unordered, int[] ordered) {
        
        this.showMatrixOne(unordered);
        this.showMatrixTwo(ordered);
        this.setVisible(true);
    }
    
    public void showMatrixOne(int[] a) {
        for(int i=0; i<a.length; i+=1){
            
            this.arrayOnePanel.add(new JLabel("<html><h3>"+a[i]+"<h3><html>"));
        }
    }
    
    public void showMatrixTwo(int[] a) {
        for(int i=0; i<a.length; i+=1){
            
            this.arrayTwoPanel.add(new JLabel("<html><h3>"+a[i]+"<h3><html>"));
        }
    }
}
