package ejercicioanimal;

import Service.AnimalsService;

/**
 *
 * @author Germán M. Anselmo
 */

public class EjercicioAnimal {

    public static void main(String[] args) {
        
        AnimalsService as = new AnimalsService();
        
        as.cargarAnimales();
        
        as.hacerRuido();
        
    }
    
}
