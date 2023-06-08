package ejercicios.extra;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra19 {
    
    public static void main(String[] args) {
        
        int n = Aleatorio();
        
        int[] vector1 = new int[n];
        
        int[] vector2 = new int[n];
        
        int longitud = n;
        
        for (int i = 0; i < n; i++) {
            
            int num = Aleatorio();
            
            vector1[i] = num;            
            
            num = Aleatorio();
            
            vector2[i] = num; 
                     
        }
                
        int contador = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (vector1[i] == vector2[i]) {
                
                ++contador;
                
            } else {
                
                System.out.println("Los vectores NO son identicos.");
                
                break;
                
            }    
            
        } 
        
        if (contador == n) {
            
            System.out.println("Los vectores son identicos.");
            
        }

    }
    
    public static int Aleatorio() {
               
        return (int) (Math.random() * 10);
                
    }
    
}
