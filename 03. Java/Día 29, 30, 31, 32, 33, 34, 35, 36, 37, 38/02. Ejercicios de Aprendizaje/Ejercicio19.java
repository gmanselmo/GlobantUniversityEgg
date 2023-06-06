package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        
        int[][] traspuesta = new int[3][3];
        
        rellenarMatriz( matriz);
        
        generarTranspuesta(matriz, traspuesta);
        
        impimirMatrices(matriz, traspuesta);
        
        boolean resultado = antiSimetrica(matriz, traspuesta);
        
        if (resultado == true) {
            
            System.out.println("Es anti simétrica.");
            
        } else {
            
            System.out.println("No es anti simétrica.");
            
        }

    }
    
    public static void rellenarMatriz(int[][] matriz) {
        
        Scanner ingreso = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.println("Ingrese un entero:");
                
                matriz[i][j] = ingreso.nextInt();

            }
            
        }

    }
    
    public static void generarTranspuesta(int[][] matriz, int[][] traspuesta) {
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                traspuesta[j][i] = matriz[i][j];

            }
            
        }        
        
    }
    
    public static void impimirMatrices(int[][] matriz, int[][] traspuesta) {
        
        System.out.println("Matriz:");
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("Traspuesta:");
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print(traspuesta[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    public static boolean antiSimetrica(int[][] matriz, int[][] traspuesta) {
        
        boolean resultado = false;
        
        int a, b, contador = 0;
        
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                a = matriz[i][j];
                
                b = traspuesta[i][j];
             
                if ((a == b) && (a != 0) && (b != 0)) {
                    
                    resultado = false;
                    
                } else if ((a == 0) && (b == 0)) {
                    
                    ++contador;

                } else if ((a < 0) && (b > 0)) {
                    
                    a = a * (-1);
                    
                    if (a == b) {
                        
                        ++contador;

                    }
                    
                } else if ((a > 0) && (b < 0)) {
                    
                    b = b * (-1);
                    
                    if (a == b) {
                        
                        ++contador;

                    }
                    
                }
                    
            }
            
        }
        
        if (contador == 9) {
            
            resultado = true;
            
        }
        
        return resultado;

    }
    
}
