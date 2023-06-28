package ejercicio6poo;

import Entidad.Cafetera;
import Servicio.CafeteraService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio6POO {

    public static void main(String[] args) {
        
        Cafetera Nespresso = CafeteraService.encenderCafetera();
        
        CafeteraService.llenarCafetera(Nespresso);
        
        CafeteraService.servirTaza(500, Nespresso);
        
        CafeteraService.vaciarCafetera(Nespresso);
        
        CafeteraService.agregarCafe(1000, Nespresso);
        
        CafeteraService.servirTaza(500, Nespresso);
        
    }
    
}
