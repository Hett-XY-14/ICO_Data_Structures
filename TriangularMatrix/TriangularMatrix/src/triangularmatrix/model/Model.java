/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.model;

/**
 *
 * @author Hoeco
 */
public class Model {
    
    //Local class Matrix
    public class Matrix {
        public int[][] innerMatrix;
        public int type;
        
        Matrix() {
            this.innerMatrix = null;
            this.type = -1;
        }
        
        Matrix(int[][] innerMatrix, int type1) {
            this.innerMatrix = innerMatrix;
            this.type = type1;
        }
    }
    
    //Attributes
    public Matrix matrixOne;
    public Matrix matrixTwo;
    public Matrix combinedMatrix;
    
    //Default Constructor
    public Model() {
        this.matrixOne = null;
        this.matrixTwo = null;
        this.combinedMatrix = null;
    }
    //Costructor
    public Model(int[][] m1, int type1, int[][] m2, int type2) {
        this.matrixOne = new Matrix(m1, type1);
        this.matrixTwo = new Matrix(m2, type2);
        this.combinedMatrix = null;
    }
    
    //Methods
    public void combineMatrices() {
        int n = this.matrixOne.innerMatrix.length+1;
        int m = this.matrixOne.innerMatrix.length;
        int[][] newInnerMatrix = new int[m][n];
        Matrix toMapFirst = null;
        Matrix toMapSecond = null;
        
        //If both are the same type and they are superior, then the first to be mapped is the one that is not transposed
        if(this.matrixOne.type == this.matrixTwo.type && this.matrixOne.type == 1) {
            
            toMapSecond = this.transpose(matrixTwo);
            toMapFirst = this.matrixOne;
            
        } else if(this.matrixOne.type == this.matrixTwo.type) { 
            //If they are the same type but not superior, then they're inferior, so the first to be mapped is the transposed one
            toMapFirst = this.transpose(this.matrixTwo);
            toMapSecond = this.matrixOne;
            
        } else if(this.matrixTwo.type == 1){
            //If they are of a different type, the first to be mapped is the one of wich the type is superior (1)
            toMapFirst = this.matrixTwo;
            toMapSecond = this.matrixOne;
            
        } else {
            //If they are of a different type, and the matrixTwo is not the superior one, then the superior is matrixOne so is the first to be mapped
            toMapFirst = this.matrixOne;
            toMapSecond = this.matrixTwo;
            
        }
        //The first matrix to be mapped into the newInnerMatrix can be "copied"
        for(int i=0; i<toMapFirst.innerMatrix.length; i+=1){
            for(int j=0; j<toMapFirst.innerMatrix[i].length; j+=1){
                newInnerMatrix[i][j+1] =  toMapFirst.innerMatrix[i][j];
            }
        }
        
        //The second matrix to be mapped into the newInnerMatrix has to be copied in a way such that we only store the values into the places in wich there are 0 (zeros)
        for(int i=0; i<toMapSecond.innerMatrix.length; i+=1) {
            for(int j=0; j<=i; j+=1){
                newInnerMatrix[i][j] = toMapSecond.innerMatrix[i][j];
            }
        }
        
        this.combinedMatrix = new Matrix(newInnerMatrix, 2);
    }
    // A method to transpose the inner matrix of a Matrix object
    public Matrix transpose(Matrix toTranspose) {
        int matrixLength = toTranspose.innerMatrix.length;
        int matrixType = toTranspose.type;
        Matrix transposedMatrix = new Matrix(new int[matrixLength][matrixLength], 1-matrixType);
        for(int i = 0; i < matrixLength; i+=1 ) {
            for(int j = 0; j < matrixLength; j+=1) {
                transposedMatrix.innerMatrix[j][i]= toTranspose.innerMatrix[i][j];
            }
        }
        System.out.println(transposedMatrix.innerMatrix.toString());
        return transposedMatrix;
    }

    public Matrix getMatrixOne() {
        return matrixOne;
    }

    public void setMatrixOne(int[][] innerMatrix1, int type1) {
        this.matrixOne = new Matrix(innerMatrix1, type1);
        System.out.println(this.matrixOne.innerMatrix.toString());
        System.out.println(this.matrixOne.type);

    }

    public Matrix getMatrixTwo() {
        return matrixTwo;
    }

    public void setMatrixTwo(int[][] innerMatrix2, int type2) {
        this.matrixTwo = new Matrix(innerMatrix2, type2);
        System.out.println(this.matrixTwo.innerMatrix.toString());
        System.out.println(this.matrixTwo.type);


    }
    
    public Matrix getCombinedMatrix() {
        return combinedMatrix;
    }
    
    
}
