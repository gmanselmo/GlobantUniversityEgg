package ejercicioextra3poo;

import Servicio.RaicesService;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra3POO {

    public static void main(String[] args) {
        
        RaicesService calculo = new RaicesService();
        
        calculo.cargarCoeficientes();
        
        calculo.calcular();
        
    }
    
}
