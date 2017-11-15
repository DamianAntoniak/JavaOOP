/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorek;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author damia
 */
public class Wyglad extends JFrame implements ActionListener {
    
    JRadioButton[] radioButtons = new JRadioButton[4];    
    ButtonGroup group = new ButtonGroup();

    JPanel[] panel = new JPanel[6];
    JLabel[] napis = new JLabel[3];  
    JTextField[] txt = new JTextField[3]; 
    JButton but = new JButton("Oblicz");
    
    protected double liczba1 = 0;    
    protected double liczba2 = 0;    
    protected double wynik = 0;
 
    Wyglad()
    {
        super("Kalkulatorek");
        
        for (int i = 0; i < 6; i++)
        {
            panel[i] = new JPanel();
            if(i == 4) panel[i].setLayout(new GridLayout(1, 1));
            else panel[i].setLayout(new GridLayout(1, 2));
        }
            
        radioButtons[0] = new JRadioButton("Dodawanie", true);
        radioButtons[1] = new JRadioButton("Odejmowanie");        
        radioButtons[2] = new JRadioButton("Mnożenie");
        radioButtons[3] = new JRadioButton("Dzielenie");
        but.addActionListener(this);

        for (int i = 0; i < 4; i++) group.add(radioButtons[i]);
        
        Font f = new Font("Dialog", Font.BOLD, 12);
        
        napis[0] = new JLabel("Podaj x:");       
        napis[1] = new JLabel("Podaj y:");
        napis[2] = new JLabel("Wynik:");
        
        for (int i = 0; i < 3; i++) 
        {
            napis[i].setFont(f);
            txt[i] = new JTextField(10);
        }
        
        panel[0].add(napis[0]);
        panel[0].add(txt[0]);
        panel[1].add(napis[1]);
        panel[1].add(txt[1]);
        panel[2].add(radioButtons[0]);        
        panel[2].add(radioButtons[1]);
        panel[3].add(radioButtons[2]);        
        panel[3].add(radioButtons[3]);
        panel[4].add(but);
        panel[5].add(napis[2]);        
        panel[5].add(txt[2]);

        this.setLayout(new GridLayout(6, 0));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 6; i++) add(panel[i]);
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        
        if(o == but)
        {
            Scanner c = new Scanner(txt[0].getText());
            try { liczba1 = c.nextDouble(); }
            catch(InputMismatchException y)
            {
                txt[2].setText("Bład danych!");
            }
            catch(java.util.NoSuchElementException s)
            {
                txt[2].setText("Bład danych!");
            }
            
            c = new Scanner(txt[1].getText());
            try { liczba2 = c.nextDouble(); }
            catch(InputMismatchException y)
            {
                txt[2].setText("Bład danych!");
            }
            catch(java.util.NoSuchElementException s)
            {
                txt[2].setText("Bład danych!");
            }
            c.close();
            
            
            if(radioButtons[0].isSelected())
            {
                txt[2].setText(String.valueOf(liczba1 + liczba2));
            }
            
            if(radioButtons[1].isSelected())
            {
                 txt[2].setText(String.valueOf(liczba1 - liczba2));
            }
            
            if(radioButtons[2].isSelected())
            {
                txt[2].setText(String.valueOf(liczba1 * liczba2));
            }
            
            if(radioButtons[3].isSelected())
            {
                if (liczba2 == 0) txt[2].setText("Bład danych!"); 
                else txt[2].setText(String.valueOf(liczba1 / liczba2));
            }
            
        }
        
        
    }
    
    
    
}
