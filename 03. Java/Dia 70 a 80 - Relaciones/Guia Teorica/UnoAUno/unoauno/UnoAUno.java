package unoauno;

import Servicio.UnoAUnoService;

/**
 *
 * @author Germán Anselmo.
 */

public class UnoAUno {

    public static void main(String[] args) {

        UnoAUnoService uaus = new UnoAUnoService();
        
        uaus.accesoDatos();
        
        uaus.mostrarDatos();
        
    }
    
}
