package Servicio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Juego {

    ArrayList<JugadorService> jugadores = new ArrayList();

    RevolverAguaService revolverAgua;

    Scanner ingreso = new Scanner(System.in);

    public void llenarJuego() {

        System.out.println("Ingrese la cantidad de jugadores (máx 6.)");

        int cantJugadores = ingreso.nextInt();

        for (int i = 0; i < cantJugadores; i++) {

            JugadorService jugador = new JugadorService();

            jugador.crearJugador(i + 1);

            jugadores.add(jugador);

        }

        revolverAgua = new RevolverAguaService();

        revolverAgua.llenarRevolver();
          
    }

    public void ronda() {
        
        boolean juego = true;

        while (juego) {

            for (JugadorService jugador : jugadores) {
                
                boolean partida = jugador.disparo(revolverAgua);
                
                if (partida == false) {
                    
                    System.out.println(jugador.jugador.getNombre() + " ha sobrevivido una ronda.");

                } else {

                    System.out.println(jugador.jugador.getNombre() + " ha muerto.");
                   
                    juego = false;

                    break;
                  
                }

            }
            
        }

    }

}
