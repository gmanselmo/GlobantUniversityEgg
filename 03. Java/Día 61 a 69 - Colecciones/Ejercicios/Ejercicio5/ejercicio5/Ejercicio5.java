package ejercicio5;

import Servicio.PaisService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        
        PaisService ps = new PaisService();
        
        ps.cargarPaises();

        ps.ordenarPaises();
        
        ps.buscarPais();
        
    }
    
}
