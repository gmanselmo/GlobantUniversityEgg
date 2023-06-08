package ejercicios.extra;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra22 {
    
    public static void main(String[] args) {
        
        int n = 25, m = 14;
        
        int[][] matriz = new int[n][m];
        
        rellenarMatriz(matriz, n, m);
        
        imprimirMatriz(matriz, n, m);
        
        int suma = sumarMatriz(matriz, n, m);
        
        System.out.println("La suma de los elementos de la matriz es de " + suma + ".");
        
    }
    
    public static void rellenarMatriz(int[][] matriz, int n, int m) {
                
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                
                matriz[i][j] = (int) (Math.random() * 10);                
                
            }
            
        }
        
    }
    
    public static void imprimirMatriz(int[][] matriz, int n, int m) {
        
        System.out.println("Matriz:");
                
        for (int i = 0; i < n; i++) {
            
            System.out.print("| ");  
            
            for (int j = 0; j < m; j++) {
                
                System.out.print( matriz[i][j] + " | ");               
                
            }
            
            System.out.println(""); 
            
        }
        
    }
    
    public static int sumarMatriz(int[][] matriz, int n, int m) {
        
        int suma = 0;

        for (int i = 0; i < n; i++) {
                      
            for (int j = 0; j < m; j++) {
                
                suma = suma + matriz[i][j]  ;             
                
            }

        }
        
        return suma;
        
    }
    
}
