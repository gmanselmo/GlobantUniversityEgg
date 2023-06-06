package ejercicios.de.aprendizaje;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        int n = 4;
        
        int longitud = n - 1;
        
        for (int i = 0; i <= longitud; i++) {
            
            for (int j = 0; j <= longitud; j++ ) {
                
                if ((i == 0) || (i == longitud) || (j == 0) || (j == longitud)) {
                    
                   System.out.print("*  ");
                   
                } else {
                    
                    System.out.print("   ");
                    
                }
     
            }
            
            System.out.println("");

        }
    }
    
}
