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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner selecciona = new Scanner(System.in);
        
        float dolares = 0;
        float quetzales = 0;
        float total = 0;
        System.out.println("Ingrese cantidad de dolares:.");
        quetzales = Float.valueOf(selecciona.next());
    
        System.out.println("Cantidad en Quetzales");
        dolares = Float.valueOf(selecciona.next());
    
        total = (quetzales*dolares);
        
        
        System.out.println("Total:." +total);
        
        
        
        
        
        
    }
    
}