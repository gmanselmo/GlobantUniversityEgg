package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio5 {
    
    public static void main (String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int num = ingreso.nextInt();

        System.out.println("El doble es " + (num * 2) + ".");
        
        System.out.println("El triple es " + (num * 3) + ".");
        
        System.out.println("La raiz cuadrada es " + (Math.sqrt(num)) + ".");
        
    }
    
}
