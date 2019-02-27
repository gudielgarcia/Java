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
public class ejercico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner entrada = new Scanner(System.in);
        int valores[];
        valores = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el numero ");
            valores[i] = Integer.valueOf(entrada.next());
        }
        System.out.println("El valores son ");
        for (int i = 0; i < 5; i++) {
            System.out.println(valores[i]);
        }
        
    }
    
}
