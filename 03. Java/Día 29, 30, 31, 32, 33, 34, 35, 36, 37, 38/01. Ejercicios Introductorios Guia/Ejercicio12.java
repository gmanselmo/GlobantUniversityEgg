package JavaIntro;

/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int num1, num2;
        
        num1 = 25;
        
        num2 = 5;
        
        esMultiplo(num1, num2);
        
    }
    
    
    public static void esMultiplo(int num1, int num2) {
        
        if (num1 % num2 == 0) {
            
            System.out.println(num1 + " es mulltiplo de " + num2);
            
        } else {
            
            System.out.println(num1 + " no es mulltiplo de " + num2);
            
        }
        
    }

}
