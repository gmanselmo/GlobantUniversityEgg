package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class OperacionService {
    
    public static Operacion crearOperacion() {
        
        Scanner ingreso = new Scanner(System.in);
             
        Operacion operacion = new Operacion();
        
        System.out.println("Ingrese dos enteros a guardar en el objeto operación:");
                
        operacion.setNumero1(ingreso.nextInt());
        
        operacion.setNumero2(ingreso.nextInt());
        
        return operacion;
    }
    
    public static int sumar(Operacion operacion) {
        
        return operacion.getNumero1() + operacion.getNumero2();
        
    }
    
    public static int restar(Operacion operacion) {
        
        return operacion.getNumero1() - operacion.getNumero2();
        
    }
    
    public static int multiplicar(Operacion operacion) {
        
        return operacion.getNumero1() * operacion.getNumero2();
        
    }
    
    public static Double dividir(Operacion operacion) {
        
        if (operacion.getNumero2() == 0) {
            
            return (double) 0;
            
        } else {
        
            return (double) operacion.getNumero1() / operacion.getNumero2();
        
        }

    }
    
}
