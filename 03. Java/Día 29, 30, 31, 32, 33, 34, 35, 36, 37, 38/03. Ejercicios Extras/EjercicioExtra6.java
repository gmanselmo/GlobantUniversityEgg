package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra6 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int muestra = 5;
        
        int contador = 0;
        
        float promedioNoAltos = 0f;
        
        float promedioGeneral = 0f;
        
        for (int i = 0; i < muestra; i++) {
            
            System.out.println("Ingrese la altura de la persona (ej: 1,72 o 1.72 dependiendo de tu localización):");
            
            float altura = ingreso.nextFloat();
            
            if (altura < 1.6) {
                
                promedioNoAltos = promedioNoAltos + altura;
                
                promedioGeneral = promedioGeneral + altura;
                
                ++contador;
                  
            } else {
                
                promedioGeneral = promedioGeneral + altura;
                
            }
                        
        }
        
        System.out.println("Promedio de estaturas debajo de 1.6mts: " + (promedioNoAltos / contador) + ".");
        
        System.out.println("Promedio de estaturas generales: " + (promedioGeneral / muestra + "."));
 
    }
    
}
