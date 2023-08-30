package ejercicioextra3;

import Servicio.LibroService;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra3 {

    public static void main(String[] args) {

        LibroService ls = new LibroService();
        
        ls.crearLibro();
        
        ls.librosDisponibles();
        
        ls.prestamo();
        
        ls.librosDisponibles();
        
        ls.devolucion();
        
        ls.librosDisponibles();
        
    }
    
}
