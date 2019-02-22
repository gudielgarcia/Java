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
public class ejercic20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes*/
        Scanner cantidad = new Scanner(System.in);
        int numero_hombre = 0;
        int numero_mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres:");
        numero_hombre = Integer.valueOf(cantidad.next());
        System.out.println("Ingresa la cantidad de mujeres:");
        numero_mujeres = Integer.valueOf(cantidad.next());
        
        total = numero_hombre + numero_mujeres;
        
        System.out.println("El porcentaje de mujeres es:" + ((numero_mujeres *100) / total));
        System.out.println("El porcentaje de hombres es:" + ((numero_hombre *100) / total));
    }
    
}
