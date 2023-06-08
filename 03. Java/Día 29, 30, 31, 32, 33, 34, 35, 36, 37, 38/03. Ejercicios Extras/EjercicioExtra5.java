package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra5 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        float costoFinal = 0;
        
        System.out.println("Ingrese su tipo de socio (A,B,C):");
        
        String socio = ingreso.nextLine().toLowerCase();
                
        System.out.println("Ingrese el costo de su tratamiento:");
        
        float costo = ingreso.nextFloat();
        
        switch (socio) {
            
            case "a":
                costoFinal = costo - (costo * 0.50f);
                break;
                
            case "b":
                costoFinal = costo - (costo * 0.35f);
                break;
                
            case "c":
                costoFinal = costo;
                break;
                
            default:
                System.out.println("Ingreso erroneo");
                break;
                
        }
        
        System.out.println("El importe final a pagar de su tratamiento en efectivo es de : $" + costoFinal + ".");
 
    }
    
}
