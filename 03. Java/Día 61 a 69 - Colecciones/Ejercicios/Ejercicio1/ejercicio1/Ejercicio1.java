package ejercicio1;

import Servicio.PerreraService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio1 {

    public static void main(String[] args) {
        
        PerreraService ps = new PerreraService();
        
        ps.cargarPerrera();
        
        ps.mostrarPerrera();        
        
    }
    
}
