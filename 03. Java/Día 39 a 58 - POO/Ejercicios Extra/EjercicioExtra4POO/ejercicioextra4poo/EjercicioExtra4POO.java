package ejercicioextra4poo;

import Servicio.NIFService;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra4POO {

    public static void main(String[] args) {

        NIFService nif = new NIFService();
        
        nif.crearNif();
        
        nif.mostrar();
        
    }
    
}
