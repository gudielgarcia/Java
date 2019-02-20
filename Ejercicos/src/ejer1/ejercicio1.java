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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada = new Scanner (System.in);
        float numero = 0;
        
        System.out.println("Ingrese el numero");
        numero = Float.valueOf(entrada.next());
        if (numero > 0 && numero < 10){
            System.out.println("el numero ingresado contiene una cifra");
            
        }
        if(numero >=10 && numero <100){
            System.out.println("El numero ingresado contiene dos cifras");
        }
        if (numero >=100 && numero <1000){
            System.out.println("El numero ingresado contiene tres cifras");
        }
        else if (numero >=1000 && numero <10000){
            System.out.println("El numero ingreado contiene cuatro cifras");
            
        }
        else{
            System.out.println("opcion invalida");
        }
    }
    
}
