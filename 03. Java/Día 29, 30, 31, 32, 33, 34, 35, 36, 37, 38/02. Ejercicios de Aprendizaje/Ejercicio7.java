package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo. 
 */

public class Ejercicio7 {
    
    public static void main (String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        
        String frase = ingreso.nextLine();
        
        frase = frase.toLowerCase();
        
        if (frase.equals("eureka")) {
            
            System.out.println("Eureka!!");
            
        } else {
            
            System.out.println("No es eureka... :(");
        }
           
    }
    
}
