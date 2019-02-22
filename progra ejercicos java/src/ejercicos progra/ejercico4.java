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
public class ejercico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner cantidad = new Scanner(System.in);
        int Total_DOLARES = 2150;
        int Total_EUROS = 145;
        float dinero = (float)  0;
        System.out.println("Ingresa la cantidad a convertir:+");
        dinero = Float.valueOf(cantidad.next());
        
        System.out.println("La conversion a Dolares es:."+(dinero * Total_DOLARES));
        System.out.println("La conversion a Euroses:."+(dinero * Total_EUROS));
    }
    
}
