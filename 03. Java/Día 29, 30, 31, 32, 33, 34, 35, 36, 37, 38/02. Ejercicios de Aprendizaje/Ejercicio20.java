package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        
        rellenarMatriz(matriz);

        impimirMatrices(matriz);
        
        boolean filas = compruebaFilas(matriz);
        
        boolean columnas = compruebaColumnas(matriz);
        
        boolean diagonales = compruebaDiagonales(matriz);
        
        if ((filas == true) && (columnas == true) && (diagonales == true)) {
            
            System.out.println("Es un cuadrado mágico.");
            
        } else {
            
            System.out.println("No es un cuadrado mágico.");
            
        }
 
    }
    
    public static int comprobarIngreso() {
        
        Scanner ingreso = new Scanner(System.in);
        
        int numero;
        
        while (true) {
            
            System.out.println("Ingrese un entero (1 a 9):");
            
            numero = ingreso.nextInt();
            
            if ((numero < 10) && (numero > 0)) {
                
                return numero;
                
            } else {
                
                System.out.println("Entero inválido.");
                
            }
     
        }
        
    }
    
    public static void rellenarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {

                matriz[i][j] = comprobarIngreso();

            }
            
        }

    }
        
    public static void impimirMatrices(int[][] matriz) {
        
        System.out.println("Matriz:");
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
                
    }
    
    public static boolean compruebaFilas(int[][] matriz) {
        
        int[] sumaFilas = new int[3];
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                switch (i) {
                    
                    case 0:
                        sumaFilas[i] = sumaFilas[i] + matriz[i][j];
                        break;
                        
                    case 1:
                        sumaFilas[i] = sumaFilas[i] + matriz[i][j];
                        break;
                        
                    case 2:
                        sumaFilas[i] = sumaFilas[i] + matriz[i][j];
                        break;
                        
                    default:
                        break;
                }

            }
            
        }
        
        return (sumaFilas[0] == sumaFilas[1]) && (sumaFilas[0] == sumaFilas[2]) && (sumaFilas[1] == sumaFilas[2]);
    
    }
    
    public static boolean compruebaColumnas(int[][] matriz) {
        
        int[] sumaColumnas = new int[3];
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                switch (j) {
                    
                    case 0:
                        sumaColumnas[i] = sumaColumnas[i] + matriz[i][j];
                        break;
                        
                    case 1:
                        sumaColumnas[i] = sumaColumnas[i] + matriz[i][j];
                        break;
                        
                    case 2:
                        sumaColumnas[i] = sumaColumnas[i] + matriz[i][j];
                        break;
                        
                    default:
                        break;
                }

            }
            
        }
        
        return (sumaColumnas[0] == sumaColumnas[1]) && (sumaColumnas[0] == sumaColumnas[2]) && (sumaColumnas[1] == sumaColumnas[2]);
        
    }
    
    public static boolean compruebaDiagonales(int[][] matriz) {
        
        int[] sumaDiagonales = new int[2];
        
        int contador = 2;
        
        for (int i = 0; i < 3; i++) {

            sumaDiagonales[0] = sumaDiagonales[0] + matriz[i][i];
            
            sumaDiagonales[1] = sumaDiagonales[1] + matriz[i][contador];
            
            --contador;

        }
  
        return (sumaDiagonales[0] == sumaDiagonales[1]);

    }
        
}
