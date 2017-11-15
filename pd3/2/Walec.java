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
public class Walec extends Kolo {

    protected double r = 1;
    protected double h = 1;
    
    Walec()
    {
        super();
    }
    
    Walec(String n, double r, double h)
    {
        super(n, r);
        this.r = r;
        this.h = h;
    }
    
    public double objetosc()
    {
        return Math.PI * Math.pow(r, 2) * h;
    }
    
    @Override
    public double pole()
    {
        return 2 * Math.PI * r * h;
    }
    
    @Override
    public void wyswietl()
    {
        super.wyswietl();
        System.out.print(", objętość: " + objetosc());
    }
}
