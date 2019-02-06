/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

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
        // TODO code application logic here
         Scanner entrar = new Scanner (System.in);
       float numero =0;
       float cubo =0;
       float cuadrado = 0;
       int incremento =0;
       
       while (incremento !=5)
           {
               System.out.println("Escriba el numero que quiera elevar al cuadrado y al cubo:.");
               numero = entrar.nextFloat();
               cubo = numero*numero*numero;
               cuadrado = numero*numero;
               System.out.println("El numero ingresado al cuadrado es:." +cuadrado);
               System.out.println("El numero ingresado al cubo es:." +cubo);
               incremento++;
              
               
               
               
           }
           
        
        
        
        
        
    }
    
}
