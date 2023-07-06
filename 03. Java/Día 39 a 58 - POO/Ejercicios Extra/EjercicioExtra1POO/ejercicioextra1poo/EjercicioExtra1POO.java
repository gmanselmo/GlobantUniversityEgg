package ejercicioextra1poo;

import Servicio.CancionService;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra1POO {

    public static void main(String[] args) {

        CancionService cancion = new CancionService();
        
        cancion.cargarCancion();
        
        cancion.mostrarCancion();
        
    }
    
}
