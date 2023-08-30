package Servicio;

import Entidad.ArrayInteger;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class ArrayIntegerService {
    
    Scanner ingreso = new Scanner(System.in);
    
    ArrayInteger ai = new ArrayInteger();
    
    public void guardarNumeros(){

        Integer numero = 0;
        
        while (numero != -99) {
            
            System.out.println("Ingrese un número a almacenar o '-99' para salir:");
            
            numero = ingreso.nextInt();
            
            if (numero != -99) {
                
                ai.getListaNumeros().add(numero);
 
            }
            
        }

    }
    
    public void calculosAdicionales(){
        
        Integer suma = 0;
        
        for (Integer numero : ai.getListaNumeros()) {
            
            suma += numero;
            
        }
        
        if (ai.getListaNumeros().size() == 0) {
            
            System.out.println("Sin ingresos disponibles.");
            
        } else {
            
            System.out.println("La cantidad de valores leídos fue: " + ai.getListaNumeros().size() + ".");
        
            System.out.println("La suma de los valores leídos es: " + suma + ".");

            System.out.println("La media de los valores leídos es: " + (suma / ai.getListaNumeros().size()) + ".");
            
        }
        
    }
    
}
