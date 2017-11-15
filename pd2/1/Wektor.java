/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author damian
 */

import java.lang.Math;

public class Wektor {
    protected String nazwa = "w";
    protected double x = 0;    
    protected double y = 0;
    protected double z = 0;

    Wektor(){}
    
    Wektor(String n)
    {
        nazwa = n;
    }
    
    Wektor(double x, double y, double z, String nazwa)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.nazwa = nazwa;
    }
    
    void pokaz()
    {
        System.out.printf("\n" + nazwa + "[" + x + ", " + y + ", " + z + "]");
    }
    
    double oblicz_dlugosc_wektora()
    {
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    Wektor dodaj_wektory(Wektor a)
    {
        Wektor s=new Wektor();
        
        s.x = this.x + a.x;
        s.y = this.y + a.y;
        s.z = this.z + a.z;
        return s; 
    }
    
    Wektor odejmij_wektory(Wektor a)
    {
        Wektor s = new Wektor();
        
        s.x = this.x - a.x;
        s.y = this.y - a.y;
        s.z = this.z - a.z;
        return s; 
    }
    
    double iloczyn_skalarny_wektorow(Wektor a)
    {
        return this.x * a.x + this.y * a.y + this.z * a.z;
    }
    
    /*double dlugosc_wektora()
    {
        return Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }*/
}
