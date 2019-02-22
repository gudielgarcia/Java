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
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cantidad = new Scanner(System.in);
        float DESCUENTO =(float) 0.20;
        float sueldo = 0;
        
        System.out.println("Ingresa tu sueldo actual:");
        sueldo = Float.valueOf(cantidad.next());
        System.out.println("Tu nuevo sueldo es: "+ (sueldo - (sueldo * DESCUENTO)));
    }
    
}
