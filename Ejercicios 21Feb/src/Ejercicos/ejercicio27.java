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
public class ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cantidad = new Scanner(System.in);
        int numero = 0;
        int numero1 = 0;
        int numero2 = 0;
        System.out.println("ingrese un numero");
        numero = Integer.valueOf(cantidad.next());
        System.out.println("ingrese un segundo numero");
        numero1 = Integer.valueOf(cantidad.next());
        System.out.println("ingrese un tercer numero");
        numero2 = Integer.valueOf(cantidad.next());
        
        
        int suma = (numero+numero1+numero2);
        int resta = (numero-numero1-numero2);
        int multi = (numero*numero1*numero2);
        if (suma > 0 && resta > 0 && multi > 0){
            System.out.println("la suma es "+suma);
            System.out.println("la resta es "+resta);
            System.out.println("la multipÄºicacion es "+multi);

        }
        else{
            System.out.println("los numeros son negativos");
        }
    }
    
}


