package JavaIntro;

import java.util.Scanner;
        
/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int nota = 0;
                
        while (true) {
            
            System.out.println("Ingrese una nota entre 0 y 10:");
        
            nota = ingreso.nextInt();
        
            if ((nota >= 0) && (nota <= 10)) {

                System.out.println("Nota valida.");
                
                break;

            } else {

                System.out.println("Nota no valida. Ingrese una nota valida:");
            }
            
        } 
        
    }
}
