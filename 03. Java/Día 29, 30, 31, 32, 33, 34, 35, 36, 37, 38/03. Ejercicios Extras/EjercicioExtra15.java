package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra15 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        float resultado = 0;
        
        while (true) {
            
            System.out.println("Ingrese +, -, *, / para calcular o tecla s para salir: ");
            
            String operacion = ingreso.nextLine();
            
            if (operacion.equals("s")) {
                
                System.out.println("Gracias por usar!");
                
                System.exit(0);
                
            } else {
                
                System.out.println("Ingrese un número:");
            
                float num1 = ingreso.nextInt();
                
                System.out.println("Ingrese otro número:");
            
                float num2 = ingreso.nextInt();
                
                ingreso.nextLine();

                switch (operacion) {

                    case "+":
                        resultado = Sumar(num1, num2);
                        break;

                    case "-":
                        resultado = Restar(num1, num2);
                        break;

                    case "*":
                        resultado = Multiplicar(num1, num2);
                        break;

                    case "/":
                        resultado = Dividir(num1, num2);
                        break;

                    default:
                        continue;

                }

                System.out.println(num1 + operacion + num2 + "=" + resultado + ".");
                
                System.out.println("Ingrese 'c' para volver a operar o 's' para salir: ");
            
                String salida = ingreso.nextLine();
                
                if (salida.equals("s")) {
                    
                    System.out.println("Gracias por usar!");
                    
                    System.exit(0);
                    
                }
         
            }
            
        }
        
    }
    
    public static float Sumar(float num1, float num2) {
        
        return num1 + num2;
        
    }
    
    public static float Restar(float num1, float num2) {
        
        return num1 - num2;
        
    }
    
    public static float Multiplicar(float num1, float num2) {
        
        return num1 * num2;
        
    }
    
    public static float Dividir(float num1, float num2) {
        
        return num1 / num2;
        
    }
    
}
