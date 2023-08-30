package Servicio;

import Entidad.Equipo;
import Entidad.Jugador;

/**
 *
 * @author Germán Anselmo.
 */

public class UnoAMuchosService {
    
    Equipo equipo = new Equipo();
        
    public void crearJugador(String nombre, String apellido, String posicion, int numero){

        Jugador jg = new Jugador(nombre, apellido, posicion, numero);
        
        equipo.getPlantel().add(jg);
        
    }
    
    public void mostrarJugadores(){
        
        for (Jugador jugador : equipo.getPlantel()) {
            
            System.out.println(jugador);

        }
        
    }
    
}
