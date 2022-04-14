/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Hoeco
 */
public class TitlePanel extends JPanel{
    JLabel title;
    
    public TitlePanel (String titleWord) {
        this.title = new JLabel(titleWord);
        title.setFont(new Font("SansSerif", Font.PLAIN,25));
        title.setForeground(Color.black);
        this.setBorder(new EmptyBorder(1,15,1,15));
        this.setOpaque(false);  
        this.add(title
        );
    }
}
