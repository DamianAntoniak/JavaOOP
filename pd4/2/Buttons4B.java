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

public class Buttons4B  extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[4];
    JPanel[] panels = new JPanel[2];
    JTextField t = new JTextField(11);
    
    Buttons4B()
    {
        super("Przyciski");
        panels[0] = new JPanel();       
        panels[1] = new JPanel();

        panels[0].setLayout(new BorderLayout());
        panels[1].setLayout(new GridLayout(2, 2));
        panels[0].add(t, BorderLayout.WEST);

        for(int i = 0; i < 4; i++)
        {
            buttons[i] = new JButton("Przycisk " + (i + 1));
            if(i == 3)  buttons[i].setEnabled(false);
            else buttons[i].addActionListener(this);
        }
        
        panels[1].add(buttons[0]);
        panels[1].add(buttons[1]);
        panels[1].add(buttons[2]);
        panels[1].add(buttons[3]);

        panels[0].add(panels[1], BorderLayout.EAST);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panels[0]);
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == buttons[0])   
            t.setText("Wybrano przycisk 1");
        
        if(o == buttons[1])
            t.setText("Wybrano przycisk 2");
   
        if(o == buttons[2])
            t.setText("Wybrano przycisk 3");

    }
}
