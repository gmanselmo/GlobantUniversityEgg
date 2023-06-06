package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int opcion = 0;
        
        System.out.println("Ingrese dos nùmeros: ");
            
        int num1 = ingreso.nextInt();

        int num2 = ingreso.nextInt();
        
        while (opcion < 5) {
            
            System.out.println("""
                               MENU
                               1. Sumar
                               2. Restar
                               3. Multiplicar
                               4. Dividir
                               5. Salir""");

            System.out.println("Elija opción: ");

            opcion = ingreso.nextInt();
            
            switch (opcion) {

                case 1:
                    System.out.println("La suma de ambos es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("La resta de ambos es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("La multiplicaciòn de ambos es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("La divisiòn de ambos es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    ingreso.nextLine();
                    String salida = ingreso.nextLine();
                    if (salida.equalsIgnoreCase("s")) {
                        System.out.println("Gracias por usar!");
                        break;
                    } else if (salida.equalsIgnoreCase("n")) {
                        opcion = 0;
                        break;
                    }      
            }
 
        }

    }
    
}
