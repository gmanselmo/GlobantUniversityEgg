package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra14 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias:");
        
        int familias = ingreso.nextInt();
        
        int media = 0, hijos = 0;
        
        for (int i = 1; i <= familias; i++) {
            
            System.out.println("Ingrese la cantidad de hijos de la familia " + i + ":");
        
            int cantidadHijos = ingreso.nextInt();
            
            hijos = hijos + cantidadHijos;
            
            for (int j = 1; j <= cantidadHijos; j++) {
                
                System.out.println("Ingrese la edad del hijo " + j + ":");
        
                int edad = ingreso.nextInt();
                
                media = media + edad;

            }
            
        } 
        
        System.out.println("La media de la edad de todos los niños es de " + media / hijos + "años.");
    }
    
}
