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

public class Buttons3A  extends JFrame implements ActionListener {
    
    JButton b1, b2, b3, b4;
    JTextField t1;
    
    Buttons3A()
    {
        super("Przyciski");
        setLayout(new GridLayout(5, 1));
        
        t1 = new JTextField();
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
        add(t1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == b1)   
            t1.setText("Wybrano przycisk 1");
        
        if(o == b2)
            t1.setText("Wybrano przycisk 2");
   
        if(o == b3)
            t1.setText("Wybrano przycisk 3");
    }
}
