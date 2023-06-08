package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra18 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector:");
        
        int n = ingreso.nextInt(), suma = 0;
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Rellene el vector en la posición " + (i + 1) + ":");
            
            vector[i] = ingreso.nextInt();
            
            suma = suma + vector[i];
           
        }
        
        System.out.println("La suma de todos los elementos del vector es " + suma + ".");

    }

}
