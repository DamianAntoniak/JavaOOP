/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author student
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Buttons1A  extends JFrame implements ActionListener {
    
    JButton b1, b2, b3, b4;
    
    Buttons1A()
    {
        super("Przyciski");
        setLayout(new GridLayout(4, 1));
        
        b1 = new JButton("Przycisk 1");
        b2 = new JButton("Przycisk 2");        
        b3 = new JButton("Przycisk 3");
        b4 = new JButton("Przycisk 4");
        
        
        b1.addActionListener(this);        
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        b4.setEnabled(false);

        
        
        b4.setEnabled(false);
        
        add(b1); add(b2); add(b3); add(b4);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == b1)
            JOptionPane.showMessageDialog(this, "Wybrano przycisk 1", "Komunikat1",
                    JOptionPane.INFORMATION_MESSAGE);
        
        if(o == b2)
            JOptionPane.showMessageDialog(this, "Wybrano przycisk 2", "Komunikat2",
                    JOptionPane.INFORMATION_MESSAGE);
        
        if(o == b3)
            JOptionPane.showMessageDialog(this, "Wybrano przycisk 3", "Komunikat3",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
