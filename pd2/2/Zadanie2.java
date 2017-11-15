/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie2;

/**
 *
 * @author damian
 */
public class Zadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WektorN x = new WektorN();
        double t[] = {2,3,4,5};
        WektorN y = new WektorN(t);
        double heh[] = {2,3,4,5};
        WektorN a = new WektorN(heh);
        
        double h[] = {8,5,0,9};
        WektorN b = new WektorN(h);
        
        
        y.pokaz();
        System.out.printf("\nDlugosc wektora = %.2f\n", y.oblicz_dlugosc_wektora());
        
        b = a.dodaj_wektory(y);
        b.pokaz();
        
        b = b.odejmij_wektory(a);
        b.pokaz();
        
        System.out.printf("\nIloczyn skalarny wektora a i y = %.1f\n", a.iloczyn_skalarny_wektorow(y));
    }
    
}
