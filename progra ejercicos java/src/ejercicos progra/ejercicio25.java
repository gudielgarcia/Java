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
public class ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cantidad = new Scanner(System.in);
        int numero = 0;
        int numero1 = 0;
        System.out.println("ingrese un numero");
        numero = Integer.valueOf(cantidad.next());
        System.out.println("ingrese un segundo numero");
        numero1 = Integer.valueOf(cantidad.next());
        if (numero >= 0 && numero1 >= 0)
        {
            System.out.println("la suma es:."+(numero+numero1));
            System.out.println("la multiplicacion es:."+(numero*numero1));
        }
        else{
            System.out.println("ingrese un numero positivo");
        }
        
    }
    
}

