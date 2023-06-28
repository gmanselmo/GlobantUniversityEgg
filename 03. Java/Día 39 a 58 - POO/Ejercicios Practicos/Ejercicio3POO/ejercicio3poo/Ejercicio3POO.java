package ejercicio3poo;

import Entidad.Operacion;
import Servicio.OperacionService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio3POO {

    public static void main(String[] args) {
        
        Operacion calculadora = Servicio.OperacionService.crearOperacion();
        
        int suma = Servicio.OperacionService.sumar(calculadora);
        
        int resta = Servicio.OperacionService.restar(calculadora);
        
        int multiplicar = Servicio.OperacionService.multiplicar(calculadora);
        
        double dividir = Servicio.OperacionService.dividir(calculadora);
        
        System.out.println("La suma de ambos números es: " + suma + ".");
        
        System.out.println("La resta de ambos números es: " + resta + ".");
        
        System.out.println("La multiplicación de ambos números es: " + multiplicar + ".");
        
        if (dividir == 0) {
            
            System.out.println("Error. No puede dividirse por 0.");
            
        } else {
            
            System.out.println("La división de ambos números es: " + dividir + ".");
            
        }

    }
    
}
