/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangularmatrix.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Hoeco
 */
public class InstructionPanel extends JPanel{
    public JLabel instructionLabel;

    public InstructionPanel() {
        this.instructionLabel = new JLabel("modificar");
        this.add(instructionLabel);
        setInstructionLabel("LAWA");
    }

    public JLabel getInstructionLabel() {
        return instructionLabel;
    }

    public void setInstructionLabel(String instruction) {
        this.remove(instructionLabel);
        this.instructionLabel = new JLabel("<html><h1>"+instruction+"<h1><html>");
        this.add(this.instructionLabel);
    }
    
    
}
