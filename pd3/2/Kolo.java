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
public class Kolo extends Figura {

    protected double r = 1;
    
    Kolo()
    {
        super();
    }
    
    Kolo(String n, double r)
    {
        super(n);
        this.r = r;
    }
    
    public double pole()
    { 
        return Math.PI * Math.pow(r, 2);
    }
    
    @Override
    public void wyswietl()
    {
        super.wyswietl();
        System.out.print(", promień r = " + r + ", pole: " + pole());
    }
    
}
