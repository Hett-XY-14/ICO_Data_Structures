/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view.centralpanelcomponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Objects;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
    
    public SequencePanel(Object[] sequenceItems){
        this.sequence = new JLabel[sequenceItems.length];
        
        for(int i=0; i<sequenceItems.length; i+=1){
            if(!Objects.isNull(sequenceItems[i])) {
                this.sequence[i] = new JLabel(String.valueOf(sequenceItems[i]));
                this.sequence[i].setHorizontalAlignment(SwingConstants.CENTER);
                //this.sequence[i].setBorder(new EmptyBorder(10,10,10,10));
                this.sequence[i].setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
                this.sequence[i].setForeground(Color.WHITE);
                this.sequence[i].setOpaque(true);
                this.sequence[i].setBackground(new Color(0,32,28));
                this.sequence[i].setPreferredSize(new Dimension(26,45));
                System.out.println("alsdkifjhsakljfdlsk");
            } else {
                this.sequence[i] = new JLabel(" ");
                this.sequence[i].setHorizontalAlignment(SwingConstants.CENTER);                
                //this.sequence[i].setBorder(new EmptyBorder(10,10,10,10));
                this.sequence[i].setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
                this.sequence[i].setForeground(Color.WHITE);
                this.sequence[i].setOpaque(true);
                this.sequence[i].setBackground(new Color(190,190,190));
                this.sequence[i].setPreferredSize(new Dimension(26,45));
                System.out.println("else");
            }
            
            //this.setBackground(new Color(215,215,215));
            this.add(this.sequence[i]);
        }
    }

    public JLabel[] getSequence() {
        return sequence;
    }

    public void setSequence(Object[] sequenceItems) {
        this.removeAll();
        this.sequence = new JLabel[sequenceItems.length];
        
    }
    
    
}
