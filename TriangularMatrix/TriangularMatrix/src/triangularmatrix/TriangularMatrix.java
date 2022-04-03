/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangularmatrix;
import triangularmatrix.controller.Controller;
import triangularmatrix.view.UI;

/**
 *
 * @author v13_s
 */
public class TriangularMatrix {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A [][]= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int valor = 3;
        
        for(int x = 0; x<4; x++){
            for(int y = 0; y<=x; y++)
                A [x][y] = valor;
        }
        
        for(int x = 0; x<4; x++){
            for(int y = 0; y<4; y++)
                System.out.print(A[x][y]);
            
            System.out.println();
        
        }
   
        Controller app = new Controller();
    }
    
}
