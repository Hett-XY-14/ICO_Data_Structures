/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.model;

/**
 *
 * @author Hoeco
 * @param <T>
 */
public class CircularQueue<T> {
        private T[] innerArray;
        private int firstPositionPointer;
        private int nextPositionPointer;
        private int size;
        
    /*The class circularqueue is the model of our application, it saves and manages the data
      It consists of an array of length n, the "innerArray".
      Two pointers: firstPositionPointer and nextPositionPointer.
      An int variable "size".
      And the methods enqueue(), dequeue(), isEmpty(), isFull(),
    */
    
    // Attributes of the class:
    
    // declare an int array called "innerArray";
    // declare an int variable called firstPositionPointer;
    // declare an int variable called nextPositionPointer;
       
        
    // Constructor of the class:
    public CircularQueue(int n) {
        this.innerArray =(T[]) new Object[n];
        this.firstPositionPointer = 0;
        this.nextPositionPointer = 0;
        this.size = 0;
    // write the class constructor, it should accept an int parameter "n" as argument and using it to set the length of innerArray
    // initialize the innerArray as a new int array of length "n"
    // initialize the pointers, pointing at the same position (empty array)
    }
    
    //
    //
    /*  List of Modifications:
    
    *** I forgot to include the class attribute "size" it tracks the number of elements stored in the Circular Queue, please create it and change
        its value in the execution of the methods enqueue(+1) and dequeue(-1).
    *** In "enqueue" method: 
            Use null instead of "0", the Circular Queue must be able to manage positive and negative numbers, 0 included
            Use the expression "nextPositionPointer %= innerArray.length" to return to the index 0.
    *** In "dequeue" method:
            is not necessary to check if the position in the array pointed by firstPositionPointer is different to null, just take that value,
            save it into a new variable, increment firstPositionPointer in 1, apply the modulo operation to it to make it 0 if it is equal to the length of innerArray,
            and then return the value stored in the new variable created.
    *** In "isFull" and "isEmpty" methods:
            The method "isFull" returns True if *The whole queue* is full, false otherwise
            The method "isEmpty" returns True if *The whole queue* is empty, false otherwise
            Is not necessary to create the attribute (variable) boolSwitch, instead, use the attribute "size" to know if the whole queue is full or empty,
            if there are no elements in the queue, then size should be 0, if it is full, then size is equal to the length of the array.
    */
    //
    //
    
    
    // Methods:
    public void enQueue(T n) {
        if (!this.isFull()) {
            innerArray[nextPositionPointer] = n;
            nextPositionPointer += 1;
            nextPositionPointer %= innerArray.length;
            size += 1;
        }
    }
    // This method should accept an int number and store it in the innerArray position pointed by nextPositionPointer 
    // Don't forget to move nextPositionPointer to the next position, make use of the modulo operation to return to 0 once the las element of the array has been reached
    
    public T deQueue() {
        if (this.isEmpty()) {
            return null;
        } else {
            T temp = innerArray[firstPositionPointer];
            innerArray[firstPositionPointer] = null;
            firstPositionPointer += 1;
            firstPositionPointer %= innerArray.length;
            size -= 1;
            return temp;
            }
    // This method should return the oldest element in the queue (the first one)
    // Don't forget to move firstPositionPointer to the next position, 
    // make use of the modulo operation to return to 0 once the las element of the array has been reached
    }
    
    public boolean isEmpty() {
    // This method should return true if the queue is empty, false otherwise
        return size == 0;
    }
    
    public boolean isFull() {
    // This method should return true if the queue is full, false otherwise
        return size == innerArray.length;
    }
    
    public T[] getInnerArray() {
    // This method should return the innerArray attribute
        return innerArray;
    }
}

