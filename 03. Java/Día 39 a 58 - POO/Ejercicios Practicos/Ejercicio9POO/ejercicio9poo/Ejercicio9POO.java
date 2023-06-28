package ejercicio9poo;

import Servicio.MatematicaService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio9POO {

    public static void main(String[] args) {

        MatematicaService matematica = new MatematicaService();
        
        matematica.cargarMatemática();
        
        System.out.println("El mayor es: " + matematica.devolverMayor() + ".");
        
        matematica.calcularPotencia();
        
        matematica.calculaRaiz();
        
    }
    
}
