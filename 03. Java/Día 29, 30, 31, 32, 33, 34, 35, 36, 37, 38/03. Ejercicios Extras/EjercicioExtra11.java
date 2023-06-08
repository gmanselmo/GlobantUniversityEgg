package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra11 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese un entero:");
        
        int entero = ingreso.nextInt();
        
        int contador = 0;
        
        while (entero > 0) {
            
            entero = entero / 10;
            
            
            ++contador;
            
        }
        
        System.out.println("El número está conformado por " + contador + " dígitos.");
        
    }
    
}
