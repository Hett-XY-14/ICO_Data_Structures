/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stackandqueue.view.centralpanelcomponents;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Hoeco
 */
public class DequePanel extends JPanel{
    private JLabel title;
    private SequencePanel sequence;
    private JTextField userInput;
    private JButton enqueueButton;
    private JButton dequeueButton;
    
    GridBagConstraints GBCTitle;
    GridBagConstraints GBCSequence;
    GridBagConstraints GBCUserInput;
    GridBagConstraints GBCAddButton;
    GridBagConstraints GBCRemoveButton;
    
    public DequePanel(String title, String addButtonLabel, String removeButtonLabel) {
        this.title = new JLabel(title);
        this.sequence = new SequencePanel();
        this.userInput = new JTextField();
        this.enqueueButton = new JButton(addButtonLabel);
        this.dequeueButton = new JButton(removeButtonLabel);
    
        initComponents();
    }
    
    public void initComponents() {
        this.setLayout(new GridBagLayout());
        this.GBCTitle = new GridBagConstraints();
        this.GBCTitle.gridx=0;
        this.GBCTitle.gridy=0;
        this.GBCTitle.gridwidth=4;
        this.GBCTitle.gridheight=1;
        this.GBCTitle.fill = GridBagConstraints.BOTH;
        this.GBCTitle.ipadx=0;
        this.GBCTitle.ipady=0;
        this.GBCTitle.anchor = GridBagConstraints.CENTER;
        this.add(this.title, this.GBCTitle);
        
        this.GBCSequence = new GridBagConstraints();
        this.GBCSequence.gridx=0;
        this.GBCSequence.gridy=1;
        this.GBCSequence.gridwidth=4;
        this.GBCSequence.gridheight=1;
        this.GBCSequence.fill = GridBagConstraints.BOTH;
        this.GBCSequence.ipadx=0;
        this.GBCSequence.ipady=0;
        this.GBCSequence.anchor = GridBagConstraints.CENTER;
        this.add(this.sequence, this.GBCSequence);
        
        this.GBCUserInput = new GridBagConstraints();
        this.GBCUserInput.gridx=1;
        this.GBCUserInput.gridy=2;
        this.GBCUserInput.gridwidth=1;
        this.GBCUserInput.gridheight=1;
        this.GBCUserInput.fill = GridBagConstraints.BOTH;
        this.GBCUserInput.ipadx=0;
        this.GBCUserInput.ipady=0;
        this.GBCUserInput.anchor = GridBagConstraints.CENTER;
        this.add(this.userInput, this.GBCUserInput);
        
        this.GBCAddButton = new GridBagConstraints();
        this.GBCAddButton.gridx=2;
        this.GBCAddButton.gridy=2;
        this.GBCAddButton.gridwidth=1;
        this.GBCAddButton.gridheight=1;
        this.GBCAddButton.fill = GridBagConstraints.BOTH;
        this.GBCAddButton.ipadx=0;
        this.GBCAddButton.ipady=0;
        this.GBCAddButton.anchor = GridBagConstraints.CENTER;
        this.add(this.enqueueButton, this.GBCAddButton);
        
        this.GBCRemoveButton = new GridBagConstraints();
        this.GBCRemoveButton.gridx=3;
        this.GBCRemoveButton.gridy=2;
        this.GBCRemoveButton.gridwidth=1;
        this.GBCRemoveButton.gridheight=1;
        this.GBCRemoveButton.fill = GridBagConstraints.BOTH;
        this.GBCRemoveButton.ipadx=0;
        this.GBCRemoveButton.ipady=0;
        this.GBCRemoveButton.anchor = GridBagConstraints.CENTER;
        this.add(this.dequeueButton, this.GBCRemoveButton);
        
        //this.setBackground(new Color(210,210,210));
        setUILook();
    }

    public void setUILook(){
        
        this.title.setHorizontalAlignment(SwingConstants.CENTER);
        this.title.setBorder(new EmptyBorder(20,100,20,100));
        this.title.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 23));
        this.title.setForeground(Color.WHITE);
        this.title.setOpaque(true);
        this.title.setBackground(new Color(0,32,28));
        this.title.setPreferredSize(new Dimension(300,40));
        
        this.sequence.setPreferredSize(new Dimension(300,60));
        this.sequence.setBackground(new Color(210,210,210));
        
        this.userInput.setPreferredSize(new Dimension(100,30));
        
        this.enqueueButton.setBorder(null);
        this.enqueueButton.setBackground(new Color(76,121,121));
        this.enqueueButton.setPreferredSize(new Dimension(120,30));
        this.enqueueButton.setHorizontalAlignment(SwingConstants.CENTER);
        this.enqueueButton.setBorder(new EmptyBorder(5,5,5,5));
        this.enqueueButton.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        this.enqueueButton.setForeground(Color.BLACK);
        
        this.dequeueButton.setBorder(null);
        this.dequeueButton.setBackground(new Color(144,102,78));
        this.dequeueButton.setPreferredSize(new Dimension(120,30));
        this.dequeueButton.setHorizontalAlignment(SwingConstants.CENTER);
        this.dequeueButton.setBorder(new EmptyBorder(5,5,5,5));
        this.dequeueButton.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        this.dequeueButton.setForeground(Color.BLACK);
    }
    // Getters and Setters
    public JLabel getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = new JLabel(title);
    }

    public SequencePanel getSequence() {
        return sequence;
    }

    public void setSequencePanel(Object[] sequence) {
        this.remove(this.sequence);
        this.sequence = new SequencePanel(sequence);
        this.add(this.sequence, this.GBCSequence);
        this.userInput.setText("");
        this.repaint();
    }

    public JTextField getUserInput() {
        return userInput;
    }

    public void setUserInput(String value) {
        this.userInput = new JTextField(value);
    }

    public JButton getEnqueueButton() {
        return enqueueButton;
    }

    public void setEnqueueButton(String enqueueButtonLabel) {
        this.enqueueButton = new JButton(enqueueButtonLabel);
    }

    public JButton getDequeueButton() {
        return dequeueButton;
    }

    public void setDequeueButton(String dequeueButtonLabel) {
        this.dequeueButton = new JButton(dequeueButtonLabel);
    }
    
    
    
}
