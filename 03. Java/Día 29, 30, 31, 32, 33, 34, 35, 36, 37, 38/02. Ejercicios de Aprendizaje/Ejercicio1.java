package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Ingrese dos nùmeros a sumar:");
        
        num1 = ingreso.nextInt();
        
        num2 = ingreso.nextInt();
              
        int resultado = Suma(num1, num2);
        
        System.out.println("La suma de ambos números es " + resultado + ".");
        
    }
    
    public static int Suma(int num1, int num2) {
        
        return num1 + num2;
        
    }
    
}
