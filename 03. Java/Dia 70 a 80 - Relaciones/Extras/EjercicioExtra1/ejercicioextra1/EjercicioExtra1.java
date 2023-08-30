package ejercicioextra1;

import Servicio.AdopcionService;

/**
 *
 * @author Germán M. Anselmo.
 */

public class EjercicioExtra1 {

    public static void main(String[] args) {

        AdopcionService as = new AdopcionService();
        
        as.crearEntidades();
        
        as.adoptar();
        
        as.adoptar();
        
        as.mostrarEntidades("perro");
        
        as.mostrarEntidades("persona");
               
    }
    
}
