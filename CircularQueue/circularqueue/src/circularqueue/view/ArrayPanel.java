/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue.view;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class ArrayPanel extends JPanel{
    
    public int arraySize;
    
    public ArrayPanel(int size) {
        this.setLayout(new GridLayout(1,10,1,100));
        initComponents(size);
    }
    
    public void initComponents(int size){
        for (int i=0; i<size; i+=1) {
            this.add(new JLabel("test" + i));
        }
    }
    
    public void actualizeArray(int[] array) {
        this.removeAll();
        
        for (int i=0; i<array.length; i+=1) {
            this.add(new JLabel(Integer.toString(array[i])));
        }
        
        this.revalidate();
        this.repaint();
    }
}
