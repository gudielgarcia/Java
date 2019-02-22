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
public class ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cantidad = new Scanner(System.in);
        
        float precio = 0;
        float IVA = (float) 0.09;
        float pro = 0;
        
        System.out.println("precio del articulo");
        precio = Float.valueOf(cantidad.next());
        System.out.println("cantidad del articulo");
        pro = Float.valueOf(cantidad.next());
        
        float to = precio*pro;
        float total = ((precio*pro)*IVA);
        
        System.out.println("cantidad a pagar es de "+(to-total));
       

        
        
    }
    
}

