/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view.northpanelcomponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

/**
 *
 * @author Hoeco
 */
public class DatePanel extends JPanel implements ActionListener{
    Calendar calendar;
    SimpleDateFormat dateFormat;
    JLabel dateLabel;
    Timer hourChange;
    String date;
    
    public DatePanel(){ 
        this.dateFormat = new SimpleDateFormat("dd / MMM / Y");
        this.dateLabel = new JLabel ();
        setDate();
        this.dateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        this.dateLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        this.dateLabel.setForeground(Color.WHITE);
        this.setOpaque(false);      
        //this.setBackground(Color.BLACK);
        this.add(dateLabel);
        this.hourChange = new Timer(3600000,this);
        this.date="";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setDate();
    }
    
    public void setDate() {
        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
    }
    
    public void setLetterColor(Color color) {
        this.dateLabel.setForeground(color);
    }
}
