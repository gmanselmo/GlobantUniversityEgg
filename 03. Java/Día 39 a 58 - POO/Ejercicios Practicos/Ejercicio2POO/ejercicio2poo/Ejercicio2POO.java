package ejercicio2poo;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

/**
 *
 * @author Germán Anslemo.
 */

public class Ejercicio2POO {

    public static void main(String[] args) {
        
        Circunferencia circunferencia = CircunferenciaService.crearCircunferencia();
        
        CircunferenciaService.area(circunferencia);
        
        CircunferenciaService.perimetro(circunferencia);
        
    }
    
}
