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
public class ejercico15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cantidad = new Scanner(System.in);
        int años = 0;
        int meses = 0;
        int edad = 0;
        System.out.println("Ingresa años ");
        años = Integer.valueOf(cantidad.next());
        System.out.println("Ingresa meses ");
        meses = Integer.valueOf(cantidad.next());
        edad = (años * 12) + meses;
        System.out.println("tu edad en meses es:."+ edad);
        
    }
    
}
