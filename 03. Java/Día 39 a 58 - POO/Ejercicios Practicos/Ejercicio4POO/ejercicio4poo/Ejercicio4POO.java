package ejercicio4poo;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio4POO {

    public static void main(String[] args) {
        
        Rectangulo rectangulo = RectanguloService.crearRectangulo();
        
        RectanguloService.superficie(rectangulo);
        
        RectanguloService.perimetro(rectangulo);     
        
        RectanguloService.dibujarRectangulo(rectangulo);
        
    }
    
}
