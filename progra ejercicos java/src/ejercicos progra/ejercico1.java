/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicos;

/**
 *
 * @author wilson
 */
public class ejercico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Calculo de interes del prestamo de 10,000 por el 27%");
        int PRESTAMO = 10000;
        double interes =(float) PRESTAMO * 0.027;
        System.out.println("El prestamo es de 10,000");
        System.out.println("Interes a pagar es "+ interes);
        System.out.println("Fin de ejecucion");
    }
    
}
