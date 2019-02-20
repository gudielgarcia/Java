/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import java.util.Scanner;

/**
 *
 * @author wilson
 */
public class ejercico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int N, aux, inverso = 0, cifra;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("Introduce un número >= 10: ");
            N = entrada.nextInt();
        } while (N < 10);
 
        //le damos la vuelta al número
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
 
        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
        
}