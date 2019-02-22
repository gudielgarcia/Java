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
public class ejercico17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cantidad = new Scanner(System.in);
        float TASA = (float) 0.10;
        float sueldo = (float) 0;
        float vent1 = (float) 0;
        float vent2 = (float) 0;
        float vent3 = (float) 0;
        float comision = (float) 0;
        
        System.out.println("Ingrese sueldo base:");
        sueldo = Float.valueOf(cantidad.next());
        
        System.out.println("Ingrese valor de la primera venta:");
        vent1 = Float.valueOf(cantidad.next());
        System.out.println("Ingrese valor de la segunda venta:");
        vent2 = Float.valueOf(cantidad.next());
        System.out.println("Ingrese valor de la tercera venta:");
        vent3 = Float.valueOf(cantidad.next());
        
        comision = (vent1 + vent2 + vent3) * TASA;
        
        System.out.println("Tu sueldo es: " + sueldo);
        System.out.println("tu comision es: "+ comision);
        System.out.println("Total:"+ (sueldo+comision));
        
    }
    
}
