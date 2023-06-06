package ejercicios.de.aprendizaje;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        int[][] traspuesta = new int[4][4];
        
        rellenarMatriz( matriz);
        
        generarTranspuesta(matriz, traspuesta);
        
        impimirMatrices(matriz, traspuesta);
        
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = (int) (Math.random() * 10);

            }
            
        }

    }
    
    public static void generarTranspuesta(int[][] matriz, int[][] traspuesta) {
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                traspuesta[j][i] = matriz[i][j];

            }
            
        }        
        
    }
    
    public static void impimirMatrices(int[][] matriz, int[][] traspuesta) {
        
        System.out.println("Matriz:");
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 4; j++) {

                System.out.print(matriz[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("Traspuesta:");
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("| ");
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print(traspuesta[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}
