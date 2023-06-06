package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author German Anselmo.
 */

public class Ejercicio9 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra que comience con la letra 'A'");
        
        String frase = ingreso.nextLine();
        
        frase = frase.toLowerCase();
        
        if (frase.substring(0, 1).equals("a")) {
            
            System.out.println("CORRECTO");
            
        } else {
                
            System.out.println("INCORRECTO");
                
        }
        
    }
    
}
