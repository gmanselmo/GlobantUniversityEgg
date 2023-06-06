package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        int[][] grande = new int[10][10];
        
        int[][] pequenia = new int[3][3];
        
        rellenarMatrices(grande, pequenia);

        impimirMatrices(grande, pequenia);
        
        buscadora(grande, pequenia);
         
    }
       
    public static void rellenarMatrices(int[][] grande, int[][] pequenia) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Rellene la matriz de 10x10:");

        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                System.out.println("Ingrese un entero: ");

                grande[i][j] = ingreso.nextInt();

            }
            
        }

        System.out.println("Rellene la matriz de 3x3:");
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Ingrese un entero: ");

                pequenia[i][j] = ingreso.nextInt();
                
            }
            
        }

    }
        
    public static void impimirMatrices(int[][] grande, int[][] pequenia) {
        
        System.out.println("Matriz 10x10:");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 10; j++) {

                System.out.print(grande[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("Matriz 3x3:");
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 3; j++) {

                System.out.print(pequenia[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
                
    }
    
    public static void buscadora(int[][] grande, int[][] pequenia) {
        
        boolean encontrada = false;
        
        String locacion = "";
        
        for (int i = 0; i <= 7; i++) {
            
            for (int j = 0; j <= 7; j++) {

                if ((grande[i][j] == pequenia[0][0]) && (grande[i][j + 1] == pequenia[0][1]) && (grande[i][j + 2] == pequenia[0][2])) {
                    
                    if ((grande[i + 1][j] == pequenia[1][0]) && (grande[i + 1][j + 1] == pequenia[1][1]) && (grande[i + 1][j + 2] == pequenia[1][2])) {
         
                        if ((grande[i + 2][j] == pequenia[2][0]) && (grande[i + 2][j + 1] == pequenia[2][1]) && (grande[i + 2][j + 2] == pequenia[2][2])) {

                            encontrada = true;
                            
                            locacion = "Está en los indices: " + i + "-" + j + ", " + i + "-" + (j + 1) + ", " + i + "-" + (j + 2) + ", " + (i + 1) + "-" + j 
                                    + ", " + (i + 1) + "-" + (j + 1) + ", " + (i + 1) + "-" + (j + 2) + ", " + (i + 2) + "-" + j + ", " + (i + 2) + "-" + (j + 1) 
                                    + ", " + (i + 2) + "-" + (j + 2) + ".";
                            
                            break;
                            
                        }
                        
                    }
                    
                } 
                
            }
            
        }
        
        if (encontrada) {

                System.out.println("¡La matriz pequeña està dentro de la grande!");
                
                System.out.println(locacion);

        } else {

            System.out.println("¡La matriz pequeña NO està dentro de la grande!");

        }

    }

}
