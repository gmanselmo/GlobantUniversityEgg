package ejercicioextra2;

import Servicio.CineService;

/**
 *
 * @author Germán M. Anselmo
 */

public class EjercicioExtra2 {


    public static void main(String[] args) {

        CineService cs = new CineService();
        
        cs.crearSala(14);
        
        cs.cargarPelicula("TITANIC", 120, 13, "JAMES CAMERON");
        
        cs.generarClientes();
        
        cs.sentarClientes();
        
        cs.mostrarAsientos();
                
    }
    
}
