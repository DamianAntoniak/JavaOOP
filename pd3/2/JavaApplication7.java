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
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Figura[] testowa = { new Figura(), 
                             new Kolo("Kolo1", 4), new Kolo("Kolo2", 6), 
                             new Kula("Kula1", 5), new Kula("Kula2", 7),
                             new Stozek("Stozek1", 9, 4), new Stozek("Stozek2", 11, 6),
                             new Walec("Walec1", 20, 2), new Walec("Walec2", 30, 10)
                           };
        
        for(Figura i : testowa)
        {
            i.wyswietl();
        }
        System.out.print("\n");  
    }
    
}
