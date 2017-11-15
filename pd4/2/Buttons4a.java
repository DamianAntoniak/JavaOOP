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

public class Buttons4a  extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[4];
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JTextField t1 = new JTextField();
    
    Buttons4a()
    {
        super("Przyciski");
        setSize(500, 400);
        p1.setLayout(new BorderLayout());
        p2.setLayout(new BorderLayout());
        p3.setLayout(new BorderLayout());
        p1.add(t1, BorderLayout.CENTER);

        for(int i = 0; i < 4; i++)
        {
            buttons[i] = new JButton("Przycisk " + (i + 1));
            if(i == 3)  buttons[i].setEnabled(false);
            else buttons[i].addActionListener(this);
        }

        p2.add(buttons[0], BorderLayout.WEST);        
        p2.add(buttons[1], BorderLayout.EAST);        
        p3.add(buttons[2], BorderLayout.WEST);        
        p3.add(buttons[3], BorderLayout.EAST);    

        p2.add(p3, BorderLayout.SOUTH);
        p1.add(p2, BorderLayout.SOUTH);
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
