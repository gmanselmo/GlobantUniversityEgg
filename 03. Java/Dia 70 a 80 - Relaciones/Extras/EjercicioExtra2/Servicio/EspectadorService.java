package Servicio;

import Entidad.Espectador;

/**
 *
 * @author Germán M. Anselmo
 */

public class EspectadorService {
    
    public static Espectador crearEspectador(String nombre, Integer edad, Integer dineroDisponible) {
        
        return new Espectador(nombre, edad, dineroDisponible);
        
    }
    
}
