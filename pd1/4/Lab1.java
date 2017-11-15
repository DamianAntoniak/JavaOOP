/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
/**
 *
 * @author damian
 */

import java.util.Scanner;

public class Lab1 {

    static void zad_A(int n)
    {
         for(int i = 1; i < n + 1; i++)
         {
             for(int j = 0; j < i; j++) System.out.print(i);
             System.out.print("\n");
         }
    }
    
    static void zad_B(int n)
    {
         for(int i = 1; i < n + 1; i++)
         {
             for(int j = 1; j < i + 1; j++) System.out.print(j);
             System.out.print("\n");
         }
    }
    
    static void zad_C(int n)
    {
         for(int i = 0; i < n; i++)
         {
             for(int j = 0; j < n; j++) System.out.print("*");
             System.out.print("\n");
         }
    }
    
    static void zad_D(int n)
    {
         for(int i = 1; i < n + 1; i++)
         {
             for(int j = 0; j < i; j++) System.out.print("*");
             System.out.print("\n");
         }
    }
    
    static void zad_E(int n)
    {
         for(int i = n; i >= 1; i--)
         {
             for(int j = 0; j < i; j++) System.out.print(" ");
             System.out.print("*");
             for(int j = n; j > i; j--) System.out.print("**");
             System.out.print("\n");
         }
    } 
     
    
    public static void main(String[] args) {
        int n = 0;
        do
        {
            System.out.print("Podaj n(1-10): "); 
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
        }
        while(!(n >= 1 && n <= 10));
        
        System.out.print("Punkt A:\n");                 
        zad_A(n);
        System.out.print("\nPunkt B:\n"); 
        zad_B(n);
        System.out.print("\nPunkt C:\n"); 
        zad_C(n);
        System.out.print("\nPunkt D:\n"); 
        zad_D(n);
        System.out.print("\nPunkt E:\n"); 
        zad_E(n);
    }
    
}
