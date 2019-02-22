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
public class ejercico11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cantidad = new Scanner(System.in);
        float segundos = (float ) 0;
        float minutos = (float ) 0;
        float hora = (float ) 0;
        float PRE_SEGUNDOS = (float ) 0.25;
        float tiempo_segundos = (float ) 0;
        System.out.println("Ingresa la cantidad de horas:.");
        hora = Float.valueOf(cantidad.next());
        System.out.println("Ingresa la cantidad de minutos:.");
        minutos = Float.valueOf(cantidad.next());
        System.out.println("Ingresa la cantidad de segundos:.");
        segundos = Float.valueOf(cantidad.next());
        tiempo_segundos = segundos + (minutos * 60 )+ ((hora * 60)*60) ;
        System.out.println("El costo es:."+ (tiempo_segundos * PRE_SEGUNDOS));
    }
    
}
