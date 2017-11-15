/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Damian
 */
public class KoloA extends FiguraA implements FiguraI {

    protected double r = 1;

    KoloA() {}
    
    KoloA(String n, double r)
    {
        super(n);
        this.r = r;
    }

    public double oblicz_pole() {
        return Math.PI * Math.pow(r, 2);
    }

    public double oblicz_obwod() {
        return 2 * Math.PI * r;
    }

    public void wyswietl_obwod() {
        System.out.print("Obwod: " + oblicz_obwod());
    }

    public void wyswietl_pole() {
        System.out.print("Pole: " + oblicz_pole());
    }
    
    //Zeby w glownym pliku nie wyswietlac pojedynczo tych informacji to
    //pozwolilem sobie dodac ponizsza metode 
    public void wyswietl_wszystko()
    {
        this.wyswietl_nazwe();
        System.out.print(", ");
        this.wyswietl_pole();
        System.out.print(", ");
        this.wyswietl_obwod();
        System.out.print("\n");
    }
}
