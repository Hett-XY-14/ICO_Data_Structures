/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view.northpanelcomponents;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Hoeco
 */
public class TitlePanel extends JPanel{
    JLabel title;
    
    public TitlePanel (String titleWord) {
        this.title = new JLabel(titleWord);
        this.title.setHorizontalAlignment(SwingConstants.CENTER);
        this.title.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 24));
        this.title.setForeground(Color.WHITE);
        this.setBorder(new EmptyBorder(1,15,1,15));
        this.setOpaque(false);  
        this.add(title
        );
    }
    
    public void setLetterColor(Color color) {
        this.title.setForeground(color);
    }
}
