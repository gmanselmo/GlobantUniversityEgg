package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos enteros:");
        
        int n1, n2;
        
        n1 = leer.nextInt();
        
        n2 = leer.nextInt();
        
        if ((n1 > 25 ) && (n2 > 25 )) {
        
            System.out.println("Ambos son mayores a 25.");
        
        } else if (n1 > 25 ) {
        
            System.out.println(n1 + " es mayor a 25.");
        
        } else if (n2 > 25) {
            
            System.out.println(n2 + " es mayor a 25.");
            
        } else {
            
            System.out.println("Ninguno es mayor a 25.");
            
        }
        
    }
    
}
