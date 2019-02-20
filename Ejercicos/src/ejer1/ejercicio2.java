/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

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
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        String numero = "";
        String numero_invertido = "";
        
        System.out.println("ingrese el numero");
        numero= entrada.next();
        
        for (int i =numero.length() -1; i>= 0 ; i--)
            numero_invertido = numero_invertido + numero.charAt(i);
        System.out.println(numero_invertido);
        
        
  
        
    }
    
}
