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
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cantidad = new Scanner(System.in);
        float numero = 0;
        
        System.out.println("Numero para elevarlo al cubo");
        numero = Float.valueOf(cantidad.next());
        
        System.out.println("Numero elevado al cubo es "+(numero*numero*numero));
    }
    
}
