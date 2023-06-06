package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese un valor entero lìmite");
        
        int limite = ingreso.nextInt();
        
        int suma = 0;
        
        while (suma <= limite) {
            
            System.out.println("Ingrese un nùmero entero a sumar:");
            
            int num = ingreso.nextInt();
            
            suma = suma + num;
            
        }
        
        System.out.println("La suma total es " + suma);
        
    }
    
}
