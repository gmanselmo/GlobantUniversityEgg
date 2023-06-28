package ejercicio10poo;

import Entidad.ArregloB;
import Servicio.ArreglosService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio10POO {

    public static void main(String[] args) {
        
        ArreglosService arreglos = new ArreglosService();
        
        arreglos.cargarArregloA();
        
        arreglos.cargarArregloB();
        
        arreglos.imprimirArreglos();        

    }
    
}
