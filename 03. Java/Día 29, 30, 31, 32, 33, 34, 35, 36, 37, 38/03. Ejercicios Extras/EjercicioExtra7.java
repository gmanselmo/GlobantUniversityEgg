package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo
 */

public class EjercicioExtra7 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese un entero:");
        
        int entero = ingreso.nextInt();
        
        conWhile(entero);
        
        conDoWhile(entero);
        
    }
    
    public static void conWhile(int entero) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int contador = entero;
        
        int promedio = 0;
        
        int maximo = Integer.MIN_VALUE;
        
        int minimo = Integer.MAX_VALUE;
        
        while(contador > 0) {
            
            System.out.println("Ingrese un entero:");
        
            int n = ingreso.nextInt();
            
            promedio = promedio + n;
            
            if (n > maximo) {
                
                maximo = n;
                
            }
            
            if (n < minimo) {
                
                minimo = n;
                
            }
            
            --contador;
 
        }
        
        System.out.println("El menor es: " + minimo + ".");
        
        System.out.println("El mayor es: " + maximo + ".");
        
        System.out.println("El promedio es: " + promedio / entero + ".");
 
    }
    
    public static void conDoWhile(int entero) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int contador = entero;
        
        int promedio = 0;
        
        int maximo = Integer.MIN_VALUE;
        
        int minimo = Integer.MAX_VALUE;
        
        do {
            
            System.out.println("Ingrese un entero:");
        
            int n = ingreso.nextInt();
            
            promedio = promedio + n;
            
            if (n > maximo) {
                
                maximo = n;
                
            }
            
            if (n < minimo) {
                
                minimo = n;
                
            }
            
            --contador;
 
        } while (contador > 0);
        
        System.out.println("El menor es: " + minimo + ".");
        
        System.out.println("El mayor es: " + maximo + ".");
        
        System.out.println("El promedio es: " + promedio / entero + ".");
        
    }
    
}
