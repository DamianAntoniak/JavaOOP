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
    
    static Figura f1, f2;
    static Kolo k1, k2;
    
    public static void main(String[] args) {
        
        f1 = new Figura();        
        f2 = new Figura("Figura 2");
        k1 = new Kolo();
        k2 = new Kolo("Kolo1", 123);
        
        f1.wyswietl();
        k2.wyswietl();

        
    }
    
}
