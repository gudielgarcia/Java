/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje;

import java.util.Scanner;

/**
 *
 * @author wilson
 */
public class N1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        
        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++)
        {
            mayusculas[j] = (char) i;
        }   
        
        String cadena = "";
        int opcion = -1;
       
        do
        {
            System.out.println("Ingrese un indice entre 0 y"+(mayusculas.length -1));
            opcion = Integer.valueOf(entrada.next());
            
            if (!(opcion >= 0 && opcion <= mayusculas.length -1))
            {
                System.out.println("Error en la ejecucion ingrese otro numero");
            }
            else
            {
                if (opcion != -1)
                {
                    cadena += mayusculas[opcion];
                }
            }
        } while (opcion != -1);
        System.out.println(cadena);
    }
    
}
