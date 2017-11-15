/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author damia
 */
public abstract class FiguraA {
    protected String nazwa = "f";
    
    FiguraA()
    {
        nazwa = "Figura";
    }
    
    FiguraA(String nazwa)
    {
        this.nazwa = nazwa;
    }
    
    public void wyswietl_nazwe()
    {
        System.out.print(nazwa);
    }
}
