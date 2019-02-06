/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.util.Scanner;

/**
 *
 * @author wilson
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingrese = new Scanner (System.in);
        int elegir = 0;
        float cantidad_dolar = 0;
        float cantidad_quetzal = 0;
        float valor_quetzal = 0;
        float total_quetzal = 0;
        float Total = 0;
        System.out.println("Convertidor de dolar a Quetzal:. (1) \n  COnvertidor de Quetzal a Dolar:. (2)");
        elegir = ingrese.nextInt();
        
        if (elegir == 1)
        {
            System.out.println("Escriba la cantidad en dolares:");
            cantidad_dolar = Float.valueOf(ingrese.next());
            System.out.println("Escriba el valor del dolar hoy en dia:");
            valor_quetzal = Float.valueOf(ingrese.next());
            total_quetzal = cantidad_dolar * valor_quetzal;
            System.out.println("Total:." +total_quetzal);
            
        }
        else if (elegir ==2)
            {
                
                System.out.println("Escriba la cantidad en dolares:");
                cantidad_dolar = Float.valueOf(ingrese.next());
                System.out.println("Escriba la cantidad en Quetzales:");
                cantidad_quetzal = Float.valueOf(ingrese.next());
                Total =(cantidad_quetzal/cantidad_dolar);
                System.out.println("La cantidad en dolares es:" +Total);
            }
            else
            {
               System.out.println("Opcion Invalida");
            }
    }
    
}

 