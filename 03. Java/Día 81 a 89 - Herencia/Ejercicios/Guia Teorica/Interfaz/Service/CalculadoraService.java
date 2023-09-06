package Service;

import Entidad.Calculadora;

/**
 *
 * @author Germán M. Anselmo
 */

public class CalculadoraService {
    
    Calculadora calculadora = new Calculadora();
    
    public void sumar(int a, int b) {
        
        calculadora.sumar(a, b);
        
    }
    
    public void restar(int a, int b){
        
        calculadora.restar(a, b);
        
    }
    
    public void constanteInterfaz() {
        
        calculadora.mostrarConstante();
        
    }
    
}
