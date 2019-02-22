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
public class ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cantidad = new Scanner(System.in);
        float numero = 0;
        System.out.println("ingrese un numero");
        numero = Float.valueOf(cantidad.next());
        
        System.out.println("la  raiz cuadrada es "+Math.sqrt(numero));
        
    }
    
}

