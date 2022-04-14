/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sparsematrix;
import javax.swing.JOptionPane;
import sparsematrix.controller.Controller;

/**
 *
 * @author Hoeco
 */
public class SparseMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows in the sparse matrix: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns in the sparse matrix: "));
        Controller app = new Controller(n, m);
        app.start();
    }
    
}
