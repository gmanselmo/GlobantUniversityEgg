package ejercicio3;

import Servicio.BarajaService;

/**
 *
 * @author Germán M. Anselmo
 */

public class Ejercicio3 {

    public static void main(String[] args) {
        
        BarajaService baraja = new BarajaService();
        
        baraja.llenarBaraja();

        baraja.barajar();
        
        baraja.siguienteCarta();
        
        baraja.cartasDisponibles();
        
        baraja.darCartas();
        
        baraja.cartasMonton();
        
        baraja.mostrarBaraja();
            
    }
    
}
