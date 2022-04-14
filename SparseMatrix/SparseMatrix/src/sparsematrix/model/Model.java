/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.model;

import java.util.Arrays;

/**
 *
 * @author Hoeco
 */
public class Model {
    public int nRows;
    public int mColumns;
    public int[][] compactMatrix;
    
    public Model(int n, int m) {
        this.nRows = n;
        this.mColumns = m;
        this.compactMatrix = null;
    }
    
    public void storeMatrix(int [][] sparseMatrix) {
        int numberOfElements = 0;
        int element = 0;
        
        for (int i=0; i<sparseMatrix.length; i+=1) {
            for (int j=0; j<sparseMatrix[i].length; j+=1) {
                if (sparseMatrix[i][j]!=0) {
                    numberOfElements +=1;
                }
            }
        }
        
        this.compactMatrix = new int[3][numberOfElements];
        
        for (int i=0; i<sparseMatrix.length; i+=1) {
            for (int j=0; j<sparseMatrix[i].length; j+=1) {
                if(sparseMatrix[i][j] != 0) {
                    compactMatrix[0][element] = sparseMatrix[i][j];
                    compactMatrix[1][element] = i;
                    compactMatrix[2][element] = j;
                    element += 1;
                }
            }
        }
        showCompactMatrix(numberOfElements);
        
    }
    
    public void showCompactMatrix(int n) {
        
        for (int i=0; i<3; i+=1) {
            switch(i) {
                case 0:
                    System.out.print("Value: ");
                    break;
                case 1:
                    System.out.print("Row:   ");
                    break;
                case 2:
                    System.out.print("Column: ");
                    break;
            }
            for (int j=0; j<n; j+=1) {
                System.out.print("[" + compactMatrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public int[][] reconstructMatrix() {
        int[][] reconstructed = new int[this.nRows][this.mColumns];
        
        
            for (int j=0; j<compactMatrix[0].length; j+=1) {
                int value = compactMatrix[0][j];
                int row = compactMatrix[1][j];
                int column = compactMatrix[2][j];
                reconstructed[row][column] = value;
            }
        
        return reconstructed;
    }
}
