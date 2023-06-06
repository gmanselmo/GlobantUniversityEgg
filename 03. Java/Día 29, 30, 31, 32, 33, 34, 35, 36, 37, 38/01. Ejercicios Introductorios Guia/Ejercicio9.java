package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        int counter, suma;
        
        counter = 20;
        
        suma = 0;
        
        do {
            
            System.out.println("Ingrese 20 nùmeros a sumar:");
            
            int num = input.nextInt();
            
            if (num == 0) {
                
                System.out.println("Se capturó el numero cero");
                
                break;
                
            } else {
                
                suma += num;
                
                --counter;
                
            }
            
        } while (counter != 0);
        
        System.out.println("La suma de los números es :" + suma);
        
    }
    
}
