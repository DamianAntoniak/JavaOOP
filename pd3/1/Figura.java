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
public class Figura {
    protected String nazwa = "figura geometryczna";
    
    Figura() {}
    
    Figura(String nazwa)
    {
        this.nazwa = nazwa;
    }
    
    public void wyswietl()
    {
        System.out.print("\n" + nazwa);
    }
    
}
