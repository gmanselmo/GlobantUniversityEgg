package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */
public class Ejercicio3 {
    
    public static void main (String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        
        String frase = ingreso.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());

    }
    
}
