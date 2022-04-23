/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stackandqueue.Model;

/**
 *
 * @author Hoeco
 * @param <T>
 */
public interface Deque<T> {
    int size();
    void printDeque();
    void addFirst(T item);
    void addLast(T item);
    T removeFirst();
    T removeLast();
    T get(int index);
    
    default boolean isEmpty() {
        return size() == 0;
    }
    
}
