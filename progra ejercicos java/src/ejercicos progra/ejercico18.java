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
public class ejercico18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*18.Una tienda ofrece un descuento del 15% sobre el total de la compra
        y un cliente desea saber cuanto deberá pagar finalmente por su compra.*/
        Scanner cantidad = new Scanner(System.in);
        float TASA = (float) 0.15;
        float valor_c = 0;
        float descuento = 0;
        
        System.out.println("Ingrese valor de la compra:");
        valor_c = Float.valueOf(cantidad.next());
        
        descuento = valor_c * TASA;
        System.out.println("Tu descuento es:"+ descuento);
        
        System.out.println("Tu total a pagar es:" + (valor_c - descuento));
        
        
    }
    
}
