/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sparsematrix.view;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class TitlePanel extends JPanel{
    JLabel title;
    
    public TitlePanel (String titleWord) {
        this.title = new JLabel(titleWord);
        title.setFont(new Font("SansSerif", Font.PLAIN, 30));
        this.add(title
        );
    }
}
