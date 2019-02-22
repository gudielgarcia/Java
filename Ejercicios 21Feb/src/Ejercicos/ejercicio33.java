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
public class ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float libras = 0;
        float Kilogramos = (float) 2.2046;
        
        System.out.println("ingrese cantidad en cm para convertilos a pulgadas");
        libras = Float.valueOf(sc.next());
        
        System.out.println("la cantida en kilogramos es de :."+(libras*Kilogramos));
        
    }
    
}


