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
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cantidad = new Scanner(System.in);
        float PI = (float) 3.1416;
        float radio = 0;
        float area = 0;
        
        System.out.println("calcular el area de un circulo");
        System.out.println("ingrese radio de un circulo");
        radio = Float.valueOf(cantidad.next());
        
        area = (PI*(radio*radio));
        
        System.out.println("el area del circulo es de:."+area);
    }
    
}
