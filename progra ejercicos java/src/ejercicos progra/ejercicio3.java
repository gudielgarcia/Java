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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cantidad = new Scanner(System.in);
        double PRECIO_H = 1.5;
        int horas = 0;
        int horas_g = 0;
        System.out.println("Ingrese la cantidad de horas utilizada:.");
        horas = Integer.valueOf(cantidad.next());
        
        horas_g = (horas / 5);
        System.out.println("Tu total a pagar es de:." + (horas * PRECIO_H));
        System.out.println("por el uso de internet obtuviste "+ horas_g + " horas gratis");
        
        
    }
    
}
