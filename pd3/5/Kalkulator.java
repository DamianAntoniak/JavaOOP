/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ostatnie;

/**
 *
 * @author Damian
 */
import java.util.Scanner;

public class Kalkulator implements IOperacje {

    protected double liczba1 = 0;
    protected double liczba2 = 0;
    protected String znak = "+";

    Kalkulator() {
    }
    
    Kalkulator(double liczba1, double liczba2, String znak)
    {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.znak = znak;
    }

    public void wczytaj()
    {
        Scanner c = new Scanner(System.in);
        
        System.out.print("Podaj liczbe1: ");
        liczba1 = c.nextDouble();
        System.out.print("Podaj liczbe2: ");
        liczba2 = c.nextDouble();
        System.out.print("Podaj znak dzialania: ");
        znak = c.next();    
    }
    
    public String dodaj() {
        
        return String.valueOf(liczba1 + " + " + liczba2 + " = " + (liczba1 + liczba2));
    }

    public String odejmij() {
        return String.valueOf(liczba1 + " - " + liczba2 + " = " + (liczba1 - liczba2));
    }

    public String podziel() {
        if (liczba1 == 0 || liczba2 == 0) {
            return "Nie można dzielić przez zero!";
        } else {
            return String.valueOf(liczba1 + " / " + liczba2 + " = " + (liczba1 / liczba2));
        }
    }

    public String pomnoz() {
        return String.valueOf(liczba1 + " * " + liczba2 + " = " + (liczba1 * liczba2));
    }

    public void wyswietl()
    {
        System.out.print(dzialanie(znak) + "\n");
    }
    
    public String dzialanie(String c) {
        switch (c) {
            
            case "+": return dodaj();
            
            case "-": return odejmij();
                
            case "/": return podziel();
                
            case "*": return pomnoz();
            
            default: return "Niepoprawne działanie";
        }
    }
}
