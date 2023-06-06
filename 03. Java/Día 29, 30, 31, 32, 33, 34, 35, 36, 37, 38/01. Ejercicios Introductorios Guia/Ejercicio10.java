package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int counter = 4;
        
        while (counter != 0) {
            
            System.out.println("Ingrese un nùmero");
            
            int num = input.nextInt();
            
            System.out.print(num + " ");
            
            for (int i = 0; i < num; i++) {
                
                System.out.print("*");
                
            }

            --counter;
        
            System.out.println("");
        
        }       
        
    }
}
