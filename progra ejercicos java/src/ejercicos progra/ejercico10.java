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
public class ejercico10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        float M_CUBICO = (float)0.5;
        float largo = 0;
        float anch = 0;
        
        System.out.println("Largo de la pared en metros:");
        largo = Float.valueOf(dato.next());
        System.out.println("Ancho de la pared en metros:");
        anch =  Float.valueOf(dato.next());
        
        System.out.println("La arena requerida es:."+ ((largo * anch )*M_CUBICO));
        
    }
    
}
