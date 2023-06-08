package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra9 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese en orden dos números a dividir por resta:");
        
        int n1 = ingreso.nextInt(), n2 = ingreso.nextInt(), contador = 0;
        
        while (n1 > n2) {
            
            if(n1 > 0) {
                
                n1 = n1 - n2;
                
            }
            
            ++contador;
            
        }
        
        System.out.println("El cociente es " + contador + " y el residuo es " + n1 + ".");
                
    }
    
}
