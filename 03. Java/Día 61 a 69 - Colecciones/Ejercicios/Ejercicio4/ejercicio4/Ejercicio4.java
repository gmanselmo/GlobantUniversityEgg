
package ejercicio4;

import Servicio.PeliculaService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        PeliculaService ps = new PeliculaService();
        
        ps.cargarPeliculas();
        
        ps.mostrarPeliculas();
        
        ps.peliculasMasUnaHora();
        
        ps.duracionMayorMenor();
        
        ps.duracionMenorMayor();
        
        ps.ordenPorTitulo();
        
        ps.ordenPorDirector();

    }
    
}
