package ejercicio2;

import Servicio.PerreraService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio2 {

    public static void main(String[] args) {
        
        PerreraService ps = new PerreraService();
        
        ps.cargarPerrera();
        
        ps.mostrarPerrera();    
        
        ps.eliminarRaza();
                
    }
    
}
