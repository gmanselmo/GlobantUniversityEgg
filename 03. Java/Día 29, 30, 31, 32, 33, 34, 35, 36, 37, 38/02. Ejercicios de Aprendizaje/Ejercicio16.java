package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        int n = 25;
        
        int[] vector = new int[n];
                
        Rellenador(vector, n);
        
        Buscador(vector, n);

    }
    
    public static void Rellenador(int[] vector, int n) {
        
        for (int i = 0; i < n; i++) {
            
            vector[i] = (int) (Math.random() * 10);

        }
        
    }
    
    public static void Buscador(int[] vector, int n) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese un entero a buscar (entre 1 y " + n + "):");
        
        int buscado = ingreso.nextInt();
        
        int contador = 0;
        
        String frase = "El número " + buscado + " se encuentra en los indices: | ";
        
        for (int i = 0; i < n; i++) {

            if (vector[i] == buscado) {
                
               ++contador;
               
               frase = frase + i + " | ";
               
            }
           
        }    
        
        if (contador == 0) {
            
            System.out.println("El nùmero no se hayò en el vector.");
            
        } else {
            
            System.out.println(frase);
        
            System.out.println("El número se repite " + contador + " veces.");
            
        }
                
    }
    
}
