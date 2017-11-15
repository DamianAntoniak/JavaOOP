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
public class Stozek extends Kolo {

    protected double h = 1;
    protected double r = 1;
    
    Stozek()
    {
        super();
    }
    
    Stozek(String n, double r, double h)
    {
        super(n, r);
        this.r = r;
        this.h = h;
    }
    
    public double objetosc()
    {
        return (double)1/3 * Math.PI * Math.pow(r, 2) * h;
    }

    @Override
    public double pole()
    {
        return Math.PI * r * h;
    }
    
    @Override
    public void wyswietl()
    {
        super.wyswietl();
        System.out.print(", objętość: " + objetosc());
    }
}
