/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view;

import javax.swing.JPanel;
import stackandqueue.view.northpanelcomponents.ClockPanel;
import stackandqueue.view.northpanelcomponents.DatePanel;
import stackandqueue.view.northpanelcomponents.TitlePanel;

/**
 *
 * @author Hoeco
 */
public final class NorthPanel extends JPanel{
    private final ClockPanel clock;
    private final TitlePanel title;
    private final DatePanel date;
    
    public NorthPanel(String title) {
        this.clock = new ClockPanel();
        this.title = new TitlePanel(title);
        this.date = new DatePanel();
        
        initComponents();
    }
    
    public void initComponents() {
        this.add(clock);
        this.add(title);
        this.add(date);
    }
}
