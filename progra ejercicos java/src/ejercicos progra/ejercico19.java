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
public class ejercico19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int not1 = 0;
        int not2 = 0;
        int not3 = 0;
        int nota_final = 0;
        
        System.out.println("Ingresa primera nota:.");
        not1 = Integer.valueOf(dato.next());
        System.out.println("Ingresa segunda nota:.");
        not2 = Integer.valueOf(dato.next());
        System.out.println("Ingresa tercera nota:.");
        not3 = Integer.valueOf(dato.next());
        
        System.out.println("Tu nota final es:"+(not1 + not2 + not3));
    }
    
}
