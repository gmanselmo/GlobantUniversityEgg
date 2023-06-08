package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra3 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese una vocal");

        String vocal = ingreso.nextLine().toLowerCase();
        
        if ((vocal.equals("a")) || (vocal.equals("e")) || (vocal.equals("i")) || (vocal.equals("o")) || (vocal.equals("u"))) {
            
            System.out.println("Es una vocal.");
            
        } else {
            
            System.out.println("No es una vocal.");
            
        }
        
    }
    
}    
