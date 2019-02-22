/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicos;

import java.util.Scanner;

/**
 *
 * @author wilson
 */
public class ejercico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner cantidad= new Scanner(System.in);
        float M1 = (float) 0.05;
        float M2 = (float) 0.1;
        float M3 = (float) 0.12;
        float M4 = (float) 0.25;
        float M5 = (float) 0.50;
        float M6 = (float) 1;
        float m1 = (float) 0;
        float m2 = (float) 0;
        float m3 = (float) 0;
        float m4 = (float) 0;
        float m5 = (float) 0;
        float m6 = (float) 0;
        float total = (float) 0;
        System.out.println("Ingrese cantidad de monedas de 0.05:");
        m1 = Float.valueOf(cantidad.next());
        System.out.println("Ingrese cantidad de monedas de 0.10:");
        m2 = Float.valueOf(cantidad.next());
        System.out.println("Ingrese cantidad de monedas de 0.12:");
        m3 = Float.valueOf(cantidad.next());
        System.out.println("Ingrese cantidad de monedas de 0.25:");
        m4 = Float.valueOf(cantidad.next());
        System.out.println("Ingrese cantidad de monedas de 0.5:");
        m5 = Float.valueOf(cantidad.next());
        System.out.println("Ingrese cantidad de monedas de 1:");
        m6 = Float.valueOf(cantidad.next());
        total = (m1 * M1) + (m2 * M2) + (m3 * M3) + (m4 * M4) + (m5 * M5) + (m6 * M6); 
        System.out.println("Total: "+ total);
    }
    
}
