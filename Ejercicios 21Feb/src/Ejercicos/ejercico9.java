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
public class ejercico9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cantidad = new Scanner(System.in);
        float precio = (float) 0;
        int horas = 0;
        int horas_x = 0;
        
        System.out.println("Ingresa precio de hora:");
        precio = Float.valueOf(cantidad.next());
        System.out.println("Ingresa horas trabajadas:.");
        horas = Integer.valueOf(cantidad.next());
        System.out.println("Ingresa horas extra trabajadas:.");
        horas_x = Integer.valueOf(cantidad.next());
        
        System.out.println("Tu sueldo es:."+ ((precio * horas) +(precio * (horas_x * 2))));
    }
    
}
