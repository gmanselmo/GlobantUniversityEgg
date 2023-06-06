package JavaIntro;

import java.util.Scanner;
        
/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 4:");
        
        int ingreso = leer.nextInt();
        
        switch (ingreso) {
            
            case 1:
                System.out.println("La bomba es una bomba de agua.");
                break;
                
            case 2:
                System.out.println("La bomba es una bomba de gasolina.");
                break;
            
            case 3:
                System.out.println("La bomba es una bomba de hormigón.");
                break;
                
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia.");
                break;
                
            default:
                System.out.println("No existe un valor valido para tipo de bomba.");
        
        }
        
    }
}
