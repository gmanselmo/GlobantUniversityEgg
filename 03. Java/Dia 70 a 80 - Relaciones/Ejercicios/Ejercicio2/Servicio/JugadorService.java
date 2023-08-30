package Servicio;

import Entidad.Jugador;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class JugadorService {
       
    Jugador jugador = new Jugador();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void crearJugador(int id) {

        jugador.setId(id);
        
        System.out.println("Ingrese el nombre del jugador ");
        
        jugador.setNombre(ingreso.nextLine() + " " + id);
        
    }
    
    public boolean disparo(RevolverAguaService revolverAgua) {
                
         boolean mojar = revolverAgua.mojar();
        
        revolverAgua.siguienteChorro();
        
        return mojar;
        
    }
    
}