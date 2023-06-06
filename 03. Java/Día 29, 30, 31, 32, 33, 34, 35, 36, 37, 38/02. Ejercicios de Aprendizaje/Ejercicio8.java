package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
     
        System.out.println("Ingrese una frase de 8 caractères màximo: ");
        
        String frase = ingreso.nextLine();
        
        if (frase.length() == 8) {
            
            System.out.println("CORRECTO");
            
        } else {
            
            System.out.println("INCORRECTO");
            
        }
        
    }
    
}
