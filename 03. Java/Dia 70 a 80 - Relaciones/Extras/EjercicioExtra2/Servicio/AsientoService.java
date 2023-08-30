package Servicio;

import Entidad.Asiento;
import Enum.Letras;

/**
 *
 * @author Germán M. Anselmo
 */

public class AsientoService {
    
    public Asiento crearAsiento(Integer numero, Letras letra) {
        
        return new Asiento(numero, letra);
        
    }
    
}
