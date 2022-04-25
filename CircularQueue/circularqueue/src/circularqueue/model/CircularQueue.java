/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.model;

/**
 *
 * @author Hoeco
 */
public class CircularQueue {
        public int[] innerArray;
        public int firstPositionPointer;
        public int nextPositionPointer;
        public boolean boolSwitch;
    /*The class circularqueue is the model of our application, it stores and manages the data
      It consists of an array of length n, the "innerArray".
      Two pointers: firstPositionPointer and nextPositionPointer.
      And the methods enqueue(), dequeue(), isEmpty(), isFull(),
    */
    
    // Attributes of the class:
    
    // declare an int array called "innerArray";
    // declare an int variable called firstPositionPointer;
    // declare an int variable called nextPositionPointer;
       
        
    // Constructor of the class:
    public CircularQueue(int n) {
        innerArray = new int[n];
        firstPositionPointer = 0;
        nextPositionPointer = 0;
    // write the class constructor, it should accept an int parameter "n" as argument and using it to set the length of innerArray
    // initialize the innerArray as a new int array of length "n"
    // initialize the pointers, pointing at the same position (empty array)
    }
    
    // Methods:
    public void enQueue(int n) {
        if(innerArray[nextPositionPointer] != 0){
         boolSwitch = true;
       }else {
         boolSwitch = false;
         innerArray[nextPositionPointer] = n;
         nextPositionPointer += 1;           
         if(nextPositionPointer%innerArray.length == 0){
              nextPositionPointer = 0; 
         }         
       } 
    // This method should accept an int number and store it in the innerArray position pointed by nextPositionPointer 
    // Don't forget to move nextPositionPointer to the next position, make use of the modulo operation to return to 0 once the las element of the array has been reached
      
    }
  
    public int deQueue() {
        if(innerArray[firstPositionPointer] != 0){
           innerArray[firstPositionPointer] = 0;
           firstPositionPointer +=1;
            if(firstPositionPointer%innerArray.length == 0){
            firstPositionPointer = 0;
           }
         }else{
            //System.out.println("Insert Values");
         }  
    // This method should return the oldest element in the queue (the first one)
    // Don't forget to move firstPositionPointer to the next position, make use of the modulo operation to return to 0 once the las element of the array has been reached
    return 0;
    }
    
    public boolean isEmpty() {
    // This method should return true if the queue is empty, false otherwise
        return (boolSwitch == false);
    }
    
    public boolean isFull() {
    // This method should return true if the queue is full, false otherwise
        return (boolSwitch == true);
    }
    
    public int[] getInnerArray() {
    // This method should return the innerArray attribute
        return innerArray;
    }
}

