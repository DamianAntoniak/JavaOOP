/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author damian
 */
public class Kula extends Kolo {
    
    protected double r = 1;
    
    Kula()
    {
        super();
    }
    
    Kula(String n, double r)
    {
        super(n, r);
        this.r = r;
    }
    
    public double objetosc()
    {
        return (double)4/3 * Math.PI * Math.pow(r, 3);
    }
    
    @Override
    public double pole()
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public void wyswietl()
    {
        super.wyswietl();
        System.out.print(", objętość: " + objetosc());
    }
    
}
