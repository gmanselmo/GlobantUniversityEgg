package ejercicios.extra;

/**
 *
 * @author Gerrmán Anselmo.
 */

public class EjercicioExtra24 {
    
    public static void main(String[] args) {
        
        int n = (int) (Math.random() * 25);
        
        int[] vector = new int[n];
        
        fibonacciniadora(vector, n);

        imprimirFibonacci(vector, n);
        
    }
    
    public static void fibonacciniadora(int[] vector, int n) {
                
        vector[0] = 0;
        
        vector[1] = 1;
        
        for (int i = 2; i < n; i++) {
            
            vector[i] = vector[i - 1] + vector[i - 2];

        }

    }
    
    public static void imprimirFibonacci(int[]vector, int n) {
        
        System.out.println("Fibonacci " + n + ".");
        
        int largoVector = vector.length;
    
        for (int i = 0; i < largoVector; i++) {
            
            if (i < n - 1) {
                
                System.out.print(vector[i] + ", ");
                
            } else {
                
                System.out.print(vector[i] + ".");
                              
            } 
             
        }
        
        System.out.println("");
        
    }
    
}
