package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra16 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
                
        System.out.println("Ingrese una cantidad de personas a analizar:");
        
        int n = ingreso.nextInt();
        
        datos(n);
        
    }
    
    public static void datos(int n) {
        
        Scanner ingreso = new Scanner(System.in);
        
        String[] nombres = new String[n]; 
        
        int[] edades = new int[n];
        
        boolean[] mayoriaEdad = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Nombre de la Persona: ");
            
            String nombre = ingreso.nextLine();
            
            System.out.println("Ingrese la edad de " + nombre + ":");
            
            int edad = ingreso.nextInt();
            
            ingreso.nextLine();
                       
            nombres[i] = nombre;
            
            edades[i] = edad;
            
            if (edad >= 18) {
                
                mayoriaEdad[i] = true;
               
            } else {
                
                mayoriaEdad[i] = false;
                
            }
                        
        }
        
        int contador = n;

        for (int i = 0; i < n; i++) {

            System.out.println("Nombre: " + nombres[i] + ".");

            System.out.println("Edad: " + edades[i] + ".");

            if (mayoriaEdad[i] == true) {

                System.out.println("Mayoría de edad: Si.");

            } else if (mayoriaEdad[i] == false) {

                System.out.println("Mayoría de edad: No.");

            }
            
            if (i < n - 1) {
                
                System.out.println("Desea imprimir los datos de la siguiente persona?: (Si/No)");

                String siguiente = ingreso.nextLine().toLowerCase();

                if (siguiente.equals("no")) {

                    System.out.println("Gracias por usar!");

                    System.exit(0);
                
                }

            }
              
        }

    }
        
}
