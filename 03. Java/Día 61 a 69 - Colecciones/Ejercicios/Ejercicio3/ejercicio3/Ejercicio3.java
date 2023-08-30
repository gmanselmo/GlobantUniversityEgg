package ejercicio3;

import Servicio.AlumnoService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        AlumnoService as = new AlumnoService();
        
        as.cargarAlumnos();      
        
        as.notaFinal();
        
    }
    
}
