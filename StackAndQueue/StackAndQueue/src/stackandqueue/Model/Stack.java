/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.Model;

/**
 *
 * @author Hoeco
 * @param <T>
 */
public class Stack<T> extends LinkedListDeque<T>{
    // addLast, removeLast, 
    public Stack() {
        super();
    }
    
    public T[] returnElements() {
        T[] elements = (T[]) new  Object[this.size()];
            for (int i=0; i <this.size(); i+=1) {
                elements[i]= this.get(i);
            }
            
        return elements;
    }
    
    public void push(T item){
        this.addLast(item);
    }
    
    public T pop() {
        return this.removeLast();
    }
    
}
