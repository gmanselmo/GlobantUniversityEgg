package ejercicio1poo;

import Entidad.Libro;
import Servicio.LibroService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio1POO {

    public static void main(String[] args) {
        
    Libro libro = LibroService.cargarLibro();

    LibroService.imprimirDatos(libro);
        
    }
    
}
