package ejercicios.extra;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra2 {
    
    public static void main(String[] args) {
        
        int A, B, C, D, AUX;
        
        A = 1;
        B = 2;
        C = 3;
        D = 4;
        
        System.out.println("A = " + A + ". B = " + B + ". C = " + C + ". D = " + D + ".");
        
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;

        System.out.println("A = " + A + ". B = " + B + ". C = " + C + ". D = " + D + ".");
        
    }
    
}
