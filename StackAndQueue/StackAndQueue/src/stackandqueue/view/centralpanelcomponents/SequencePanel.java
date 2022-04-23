/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view.centralpanelcomponents;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class SequencePanel extends JPanel{
    private JLabel[] sequence;
    
    public SequencePanel() {
        this.sequence = new JLabel[5];
        for(int i=0; i<5; i+=1){
            this.sequence[i]= new JLabel("   ");
            this.add(this.sequence[i]);
        }
        
    }
    
    public SequencePanel(Object[] items){
        this.sequence = new JLabel[items.length];
        for(int i=0; i<items.length; i+=1){
            this.sequence[i] = new JLabel(String.valueOf(items[i]));
            this.add(this.sequence[i]);
        }
    }

    public JLabel[] getSequence() {
        return sequence;
    }

    public void setSequence(Object[] sequenceItems) {
        this.removeAll();
        this.sequence = new JLabel[sequenceItems.length];
        
        for(int i=0; i<sequenceItems.length; i+=1){
            this.sequence[i] = new JLabel(String.valueOf(sequenceItems[i]));
            this.add(this.sequence[i]);
        }
        this.repaint();
    }
    
    
}
