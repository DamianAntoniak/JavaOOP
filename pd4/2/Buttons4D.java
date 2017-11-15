/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author damia
 */
public class Buttons4D extends JFrame implements ActionListener {

    JButton[] buttons = new JButton[4];
    JPanel[] panels = new JPanel[3];
    JTextField textfield = new JTextField(10);

    Buttons4D() {
        super("Przyciski");

        for (int j = 0; j < 3; j++) 
            panels[j] = new JPanel();

        panels[0].setLayout(new GridLayout(2, 1));
        panels[1].setLayout(new BorderLayout());
        panels[2].setLayout(new GridLayout(2, 1));
        panels[1].add(textfield, BorderLayout.CENTER);

        for (int i = 0; i < 4; i++) {
            buttons[i] = new JButton("Przycisk " + (i + 1));
            if (i == 3) buttons[i].setEnabled(false);
            else buttons[i].addActionListener(this);
            
        }
        panels[0].add(buttons[0]);
        panels[0].add(buttons[1]);
        panels[2].add(buttons[2]);
        panels[2].add(buttons[3]);

        panels[1].add(panels[0], BorderLayout.WEST);
        panels[1].add(panels[2], BorderLayout.EAST);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panels[1]);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();

        if (o == buttons[0]) 
            textfield.setText("Wybrano przycisk 1");

        if (o == buttons[1]) 
            textfield.setText("Wybrano przycisk 2");

        if (o == buttons[2]) 
            textfield.setText("Wybrano przycisk 3");
    }
}
