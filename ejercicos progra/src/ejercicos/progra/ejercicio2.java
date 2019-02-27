/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos.progra;

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
        Scanner entrada = new Scanner(System.in);
        int cantidad = 0;
        String comodin = "";
        String salida = "";
        System.out.print("Ingrese el numero:.");
        cantidad = Integer.valueOf(entrada.next());
        if(cantidad >= 0 && cantidad <=9999){
            int longitud = String.valueOf(cantidad).length();
            comodin = String.valueOf(cantidad);
            for(int i = (longitud); i-1 >= 0 ; i--){  
                salida = salida + (comodin.subSequence(i-1, i));
                
            }
            System.out.println(salida);
            
            
        }else{
            System.out.println("opcion no valida");
        }
        
        
    }
    
}

