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
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        float P = (float) 0.25;
        float salario = 0;
        float nuevo = 0;
        
        System.out.println("ingrese su sueldo anterior");
        System.out.println("para calcular su aumento");
        salario = Float.valueOf(entrada.next());
        nuevo = salario*P;
        System.out.println("su nuevo sueldo es de "+(salario+nuevo));
        
    }
    
}
