package ejercicios.de.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in).useDelimiter("\n");
                
        System.out.println("Ingrese la cantidad de Euros a convertir:");
               
        float cantEuros = ingreso.nextFloat();
        
        System.out.println("Ingrese 'libra','dolar','yen' para convertir:");
        
        ingreso.nextLine();
        
        String monedaConvertir = ingreso.nextLine();

        Conversor(cantEuros, monedaConvertir);
        
    }
    
    public static void Conversor(float cantEuros, String monedaConvertir ) {
        
        float[] lista = new float[3];
        
        lista[0] = 0.86f;       //Libras.
        lista[1] = 1.28611f;    //Dolar.
        lista[2] = 129.852f;    //Yen.
        
        switch (monedaConvertir) {
            
            case "libra":
                System.out.println(cantEuros + " Euros son " + (cantEuros * lista[0]) + " Libras.");
                break;
                
            case "dolar":
                System.out.println(cantEuros + " Euros son " + (cantEuros * lista[1]) + " Dolares.");
                break;
                
            case "yen":
                System.out.println(cantEuros + " Euros son " + (cantEuros * lista[2]) + " Yenes.");
                break;
                
            default:
                System.out.println("Moneda no válida.");
                break;
        }
        
    }
    
}
