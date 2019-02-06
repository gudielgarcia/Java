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
public class ejercicio1 {
    private static Object ingresar;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada = new Scanner(System.in);
        
        float dolar = 0;
        float quetz = 0;
        float cambio = 0;
        System.out.println("Ingrese cantidad de dinero en quetzales:.");
        quetz = Float.valueOf(entrada.next());
    
        System.out.println("Valor del dolar 2019");
        dolar = Float.valueOf(entrada.next());
    
        cambio = (quetz/dolar);
        
        
        System.out.println("Total:." +cambio);
        
    
       
    
    }
    
}