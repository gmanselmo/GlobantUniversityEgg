package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra17 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese un número:");
        
        int numero = ingreso.nextInt();
        
        boolean retorno = esPrimo(numero);
        
        if (retorno == true) {
            
            System.out.println(numero + " es primo.");
            
        } else {
            
            System.out.println(numero + " no es primo.");
            
        }

    }
    
    public static boolean esPrimo(int numero) {
        
        int contador = 0;
        
        for (int i = 1; i <= numero; i++) {
            
            if (numero % i == 0) {
                
                ++contador; 
                
            }
 
        }
        
        if (contador != 2) {
            
            return false;
            
        } else {
            
            return true;
            
        }
        
    }
    
}
