package ejercicio14poo;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio14POO {

    public static void main(String[] args) {

        Servicio.MovilService movil1 = new Servicio.MovilService();
        
        movil1.cargarCelular();
        
        movil1.ingresarCodigo();
        
        movil1.mostarMovil();
       
    }
    
}
