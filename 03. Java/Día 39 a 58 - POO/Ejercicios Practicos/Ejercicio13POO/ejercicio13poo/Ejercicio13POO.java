package ejercicio13poo;

import Servicio.CursoService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio13POO {

    public static void main(String[] args) {
       
        CursoService matematicas = new CursoService();
        
        matematicas.crearCurso();
        
        matematicas.calcularGananciaSemanal();
        
        matematicas.imprimir();
        
    }
    
}
