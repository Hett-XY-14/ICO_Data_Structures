/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
        this.dateLabel.setFont(new Font("SansSerif", Font.PLAIN, 25));
        this.dateLabel.setForeground(new Color(0x505050));
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
}
