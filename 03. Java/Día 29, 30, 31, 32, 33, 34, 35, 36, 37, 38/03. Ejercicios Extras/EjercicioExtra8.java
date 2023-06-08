package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra8 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int leidos = 0, pares = 0, impares = 0;
        
        while (true) {
          
            System.out.println("Ingrese un entero:");

            int entero = ingreso.nextInt();
            
            if (entero % 5 == 0) {
                
                if (entero % 2 == 0) {
                    
                    ++pares;
                    
                    ++leidos;
                    
                    break;
                    
                } else {
                    
                    ++impares;
                    
                    ++leidos;
                    
                    break;
                    
                }

            } if (entero > 0) {
                
                if (entero % 2 == 0) {
                    
                    ++pares;
                    
                    ++leidos;
                    
                } else {
                    
                    ++impares;
                    
                    ++leidos;
                    
                }
                
            }
            
        }
        
        System.out.println("La cantidad de pares es: " + pares + ".");
        
        System.out.println("La cantidad de impares es: " + impares + ".");
        
        System.out.println("La cantidad de leidos es: " + leidos + ".");
    
    }
        
}
