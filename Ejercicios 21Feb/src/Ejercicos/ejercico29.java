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
public class ejercico29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float not1 = 0;
        float not2 = 0;
        float not3 = 0;
        float promedio = 0;
        
        System.out.println("ingresa nota1");
        not1 = Float.valueOf(sc.next());
        System.out.println("ingresa nota2");
        not2 = Float.valueOf(sc.next());
        System.out.println("ingresa nota3");
        not3 = Float.valueOf(sc.next());
        promedio = (not1+not2+not3)/3;
        
        if(promedio >= 16){
            System.out.println(promedio);
            System.out.println("el promedio total es de 20 gano");
            
        }
        else if(promedio >= 9.5){
            System.out.println("aprobado");
        }
        else{
            System.out.println("desaprobado");
        }
        
        
        
    }
    
}
    }
    
}
