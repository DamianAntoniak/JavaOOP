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

public class Buttons4C  extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[4];
    JPanel p1 = new JPanel();
    JPanel p3 = new JPanel();
    JTextField t1 = new JTextField(10);
    
    Buttons4C()
    {
        super("Przyciski");
        setSize(500, 500);
        p1.setLayout(new BorderLayout());
        p3.setLayout(new GridLayout(4, 1));
        p1.add(t1, BorderLayout.WEST);

        for(int i = 0; i < 4; i++)
        {
            buttons[i] = new JButton("Przycisk " + (i + 1));
            if(i == 3)  buttons[i].setEnabled(false);
            else buttons[i].addActionListener(this);
        }

        p3.add(buttons[0]);        
        p3.add(buttons[1]);        
        p3.add(buttons[2]);        
        p3.add(buttons[3]);    

        p1.add(p3, BorderLayout.EAST);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(p1);
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == buttons[0])   
            t1.setText("Wybrano przycisk 1");
        
        if(o == buttons[1])
            t1.setText("Wybrano przycisk 2");
   
        if(o == buttons[2])
            t1.setText("Wybrano przycisk 3");

    }
}
