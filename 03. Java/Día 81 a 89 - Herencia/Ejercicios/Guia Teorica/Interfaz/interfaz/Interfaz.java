package interfaz;

import Service.CalculadoraService;

/**
 *
 * @author Germán M. Anselmo
 */
public class Interfaz  {

    public static void main(String[] args) {
        
        CalculadoraService cs = new CalculadoraService();
        
        cs.sumar(15, 10);
        
        cs.restar(25, 5);      
        
        cs.constanteInterfaz();
        
    }

}
