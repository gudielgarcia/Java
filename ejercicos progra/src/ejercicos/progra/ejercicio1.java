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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cantidad = 0;
        
        System.out.print("Ingresa un numero:.");
        cantidad = Integer.valueOf(entrada.next());
        
        if(cantidad >= 0 && cantidad <=9999){
            if(cantidad >= 0 && cantidad <= 9){
                System.out.println("El numero:. "+cantidad+" tiene 1 cifra");
            }
            else if(cantidad >= 10 && cantidad <=99){
                System.out.println("El numero:. "+cantidad+" tiene 2 cifras");
            }
            else if(cantidad >= 100 && cantidad <=999){
                System.out.println("El numero:. "+cantidad+" tiene 3 cifras");
            }
            else if(cantidad >= 1000 && cantidad <=9999){
                System.out.println("El numero:. "+cantidad+" tiene 4 cifras");
            }
            
        }else{
            System.out.println("No valido.");
        }
            
        
    }
    
}

