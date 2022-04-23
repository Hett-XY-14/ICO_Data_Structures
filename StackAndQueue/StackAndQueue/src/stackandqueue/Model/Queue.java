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
public class Queue<T> extends ArrayDeque<T> {
    public Queue() {
        super();
    }
    
    public T[] returnElements() {
        T[] elements = (T[]) new Object[this.items.length];
        for(int i=0; i<this.size(); i +=1) {
            elements[this.innerIndex(i)] = this.items[innerIndex(i)];
        }
        return elements;
    }
    
    public void enqueue(T item){
        this.addLast(item);
    }
    
    public T dequeue() {
        return this.removeFirst();
    }
}
