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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student[] students = { new Student(),
                               new Student(),
                               new Student()
                            };
        
        for(Student i : students) i.wczytaj();
        
        System.out.print("\nStudenci, pobierajacy stypendium:\n");
        
        for(Student i : students) if(i.oblicz_srednia() >= 4.1) i.wyswietl();

    }
    
}
