package ejercicios.extra;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra20 {
    
    public static void main(String[] args) {
        
        int n = 25;
        
        int[] vector = new int[n];
        
        rellenadora(vector, n);
        
        impresora(vector, n);
        
    }
    
    public static void rellenadora(int[] vector, int n){
        
        for (int i = 0; i < n; i++) {
            
            vector[i] = (int) (Math.random() * 10);
            
        }
       
    }
    
    public static void impresora(int[] vector, int n){
        
        System.out.print("| ");
        
        for (int i = 0; i < n; i++) {
            
            System.out.print(vector[i] + " | ");
            
        }
        
    }
    
}
