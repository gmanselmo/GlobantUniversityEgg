package JavaIntro;

/**
 *
 * @author Germán Anselmo
 */

import java.util.Scanner;

public class CorreccionErrores3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        // Consumir el carácter de nueva línea pendiente.
        leer.nextLine();
                
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        
    }
}