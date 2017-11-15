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

        KoloA kolo1 = new KoloA();       
        KoloA kolo2 = new KoloA("Kolo2", 10);
        KwadratA kw1 = new KwadratA();
        KwadratA kw2 = new KwadratA("Kwadrat2", 10);
        
        kolo1.nazwa = "Kolo1";
        kw1.nazwa = "Kwadrat1";
        
        kolo1.wyswietl_wszystko();
        kolo2.wyswietl_wszystko();
        kw1.wyswietl_wszystko();
        kw2.wyswietl_wszystko();

        
    }
    
}
