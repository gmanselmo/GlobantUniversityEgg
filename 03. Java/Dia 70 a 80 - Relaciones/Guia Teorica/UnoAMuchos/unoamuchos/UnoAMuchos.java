package unoamuchos;

import Servicio.UnoAMuchosService;

/**
 *
 * @author Germán Anselmo.
 */

public class UnoAMuchos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        UnoAMuchosService uams = new UnoAMuchosService();
        
        uams.crearJugador("Lionel", "Messi", "Delantero", 10);
        
        uams.crearJugador("Cristiano", "Ronaldo", "Delantero", 7);
        
        uams.mostrarJugadores();
        
    }
    
}
