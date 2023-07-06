package ejercicioextra2poo;

import Servicio.PuntosService;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra2POO {

    public static void main(String[] args) {

        PuntosService puntos = new PuntosService();
        
        puntos.crearPuntos();
        
        System.out.println(puntos.distanciaEntrePares());
        
    }
    
}
