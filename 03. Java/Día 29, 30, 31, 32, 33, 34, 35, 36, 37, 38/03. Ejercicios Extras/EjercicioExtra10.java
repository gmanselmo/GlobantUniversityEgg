package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra10 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
    
        int n1 = (int) (Math.random() * 10);

        int n2 = (int) (Math.random() * 10);

        int contador = 2, aleatorio = n1 * n2;

        while (contador > 0) {

            System.out.println("Adivine el número entre 1 y 100:");

            int user = ingreso.nextInt();
            
            if (user == aleatorio) {
                
                System.out.println("Correcto!");
                
                break;
                
            } else {
                
                if (contador == 2) {
                    
                    System.out.println("Incorrecto! Tiene una chance más!");
                
                    --contador;
                    
                } else {
                    
                    System.out.println("Perdiste! El número era " + aleatorio + ".");
                    
                    --contador;
                    
                }
                
            }
        
        }
        
    }
    
}
