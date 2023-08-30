package Servicio;

import Entidad.Pelicula;

/**
 *
 * @author Germán M. Anselmo
 */

public class PeliculaService {
    
    public static Pelicula crearPelicula(String titulo, Integer duracion, Integer edadMinima, String director) {
        
        return new Pelicula(titulo, duracion, edadMinima, director);
        
    }
    
}
