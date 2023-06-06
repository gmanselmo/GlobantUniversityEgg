package ejercicios.de.aprendizaje;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        int[] vector = new int[100];
        
        Rellenador(vector);
        
        ImpresorReverso(vector);        
        
    }
    
    public static void Rellenador(int[] vector) {
        
        for (int i = 0; i < 100; i++) {
            
            vector[i] = i + 1;
            
        }
        
    }
    
    public static void ImpresorReverso(int[] vector) {
        
        System.out.print("| ");
        
        for (int i = 99; i >= 0; i--) {
            
            System.out.print(vector[i] + " | ");
            
        }

    }
    
}
