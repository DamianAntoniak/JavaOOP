/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author damian
 */
public class Student extends Osoba {

    protected String numerIndexu = "000000";
    protected int liczbaEgzaminow = 0;
    protected double[] oceny;

    @Override
    public void wyswietl() {
        super.wyswietl();
        System.out.print(", nr indexu: " + numerIndexu + ", liczba egzaminow: " + liczbaEgzaminow + ", oceny: ");

        for (double i : oceny) {
            System.out.print(i + ", ");
        }

        System.out.printf("średnia: %.2f", this.oblicz_srednia());
    }

    /*
    W metodzie 'wczytaj' nalezalaloby uzyc wyrazenia regularnego(pattern/string i matcher)
    do sprawdzenia wpisanych danych, np numer indexu '\\^[0-9]{6}' itp.
    */
    @Override
    public void wczytaj() {
        super.wczytaj();
        Scanner c = new Scanner(System.in);

        System.out.print("\nPodaj numer indexu: ");
        numerIndexu = c.next();
        System.out.print("Podaj liczbe egzaminow: ");
        liczbaEgzaminow = c.nextInt();
        oceny = new double[liczbaEgzaminow];

        for (int i = 0; i < liczbaEgzaminow; i++) {
            System.out.printf("Ocena(nr %d): ", i + 1);

            if (c.hasNextDouble()) {
                oceny[i] = c.nextDouble();
            }
        }
    }

    public double oblicz_srednia() {
        double s = 0;
        for (double i : oceny) {
            s += i;
        }
        return s / oceny.length;
    }
}
