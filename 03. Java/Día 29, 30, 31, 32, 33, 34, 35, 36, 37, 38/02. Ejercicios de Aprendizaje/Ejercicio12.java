package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int correctas = 0;
        
        int incorrectas = 0;
        
        boolean comprueba = true;
        
        while (comprueba) {
            
            System.out.println("Ingrese una cadena de 5 caracteres màximo que compience con la letra X y termine con una O.");
        
            System.out.println("O sino ingrese un FDE (&&&&&) para salir:");

            String cadena = ingreso.nextLine();
            
            cadena = cadena.toUpperCase();
            
            if ((cadena.length() == 5) && ((cadena.charAt(0) == 'X') || (cadena.charAt(4) == 'O'))) {
                
                System.out.println("CORRECTO.");
                
                ++correctas;
                
            } else if (cadena.equals("&&&&&")){
                
                comprueba = false;
                
            } else {
                
                System.out.println("INCORRECTO.");
                
                ++incorrectas;
                
            }
        
        }
        
        System.out.println("Cantidad Correctas: " + correctas);      
        
        System.out.println("Cantidad Incorrectas: " + incorrectas);
        
    }
    
}
