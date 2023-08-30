package ejercicioextra4;

import Servicio.Simulador;

/**
 *
 * @author Germán M. Anselmo
 */

public class EjercicioExtra4 {

    public static void main(String[] args) {

        Simulador simulador = new Simulador();

        simulador.crearNombres(30);

        simulador.generarDNIS(30);
        
        simulador.crearAlumnos(30);
        
        simulador.mostrarAlumnos();
        
        simulador.votacion();
                
        simulador.mostrarVotaciones();
        
        simulador.recuentoVotos();

    }
    
}
