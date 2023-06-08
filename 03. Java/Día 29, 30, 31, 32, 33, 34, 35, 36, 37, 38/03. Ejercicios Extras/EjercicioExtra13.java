package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra13 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera:");
        
        int n = ingreso.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(j);
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}
