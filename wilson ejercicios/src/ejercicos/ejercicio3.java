/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicos;

import java.util.Scanner;

/**
 *
 * @author wilson
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner de = new Scanner(System.in);
        int datos[];
        datos = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("introduzca un valor ");
            datos[i] = Integer.valueOf(de.next());
        }
        System.out.println("los valores son");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("valor-"+ datos[i]+" valor2-"+datos[9-i]);
        }
    }
    
}

