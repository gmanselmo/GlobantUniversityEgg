package Entidad;

import Intrefaces.Calculos;

/**
 *
 * @author Germán M. Anselmo
 */

public class Calculadora implements Calculos {
    
    public void mostrarConstante() {
        
        System.out.println(Calculos.CERO);
        
    }

    @Override
    public void sumar(int a, int b) {

        System.out.println(a + b);

    }

    @Override
    public void restar(int a, int b) {

        System.out.println(a - b);

    }

}
