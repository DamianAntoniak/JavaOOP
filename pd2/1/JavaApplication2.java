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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wektor w = new Wektor();   
        Wektor d = new Wektor();  
        Wektor b = new Wektor(1, 1, 1, "b");
    
        Wektor a = new Wektor(1, 2, 3, "a");
        Wektor c = new Wektor(-1, 0, -10, "c");
        w.pokaz();
        a.pokaz();
        b.pokaz();
        c.pokaz();
        
        d = a.dodaj_wektory(b).odejmij_wektory(c);
        d.pokaz();
        
        System.out.printf("\nDlugosc wektora d = %.1f", d.oblicz_dlugosc_wektora());
        System.out.printf("\nIloczyn skalarny wektora a i b = %.1f\n", a.iloczyn_skalarny_wektorow(b));
        
        

    }
    
}
