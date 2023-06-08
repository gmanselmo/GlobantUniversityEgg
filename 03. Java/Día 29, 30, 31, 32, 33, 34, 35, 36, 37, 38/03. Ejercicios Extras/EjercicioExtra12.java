package ejercicios.extra;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra12 {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 9; i++) {
            
            for (int j = 0; j <= 9; j++) {
                
                for (int k = 0; k <= 9; k++) {
                    
                    String numero = i + "-" + j + "-" + k;
                    
                    if (String.valueOf(k).equals("3")) {
                        
                        numero = i + "-" + j + "-E";
                        
                    }
                    
                    if (String.valueOf(j).equals("3")) {
                        
                        numero = i + "-E-" + k;
                    }
                    
                    if (String.valueOf(i).equals("3")) {
                        
                        numero = "E-" + j + "-" + k;
                    }
                    
                    System.out.println(numero);
                    
                }
                
            }
            
        }
        
    }
    
}
