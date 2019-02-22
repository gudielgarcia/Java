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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner cantidad = new Scanner(System.in);
        double PRECIO_KM = 10.5;
        int km = 0;
        
        System.out.println("Ingres cantidad de km:.");
        km = Integer.valueOf(cantidad.next());
        System.out.println("Su total a pagar es:." + (km * PRECIO_KM));
    }
    
}
