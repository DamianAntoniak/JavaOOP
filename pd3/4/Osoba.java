/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author damian
 */
import java.util.Scanner;

public class Osoba implements IBaza {

    protected String nazwisko = "n";
    protected String imie = "i";
    protected String pesel = "p";

    Osoba() {
    }

    Osoba(String nazwisko, String imie, String pesel) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.pesel = pesel;
    }

    public void wyswietl() {
        System.out.print("\n" + imie + " " + nazwisko + ", pesel: " + pesel);
    }
/*
    W metodzie 'wczytaj' nalezaloby uzyc wyrazenia regularnego(pattern i matcher)
    do sprawdzenia wpisanych danych, np imie i nazwisko '\\^[a-zA-Z]', pesel '\\^[0-9]{10}' itp.
*/
    public void wczytaj() {

        Scanner c = new Scanner(System.in);

        System.out.print("\nPodaj imie: ");
        imie = c.next();
        System.out.print("Podaj nazwisko: ");
        nazwisko = c.next();
        System.out.print("Podaj pesel: ");
        pesel = c.next();
    }
}
