package ejercicio12poo;

import Servicio.PersonaService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio12POO {

    public static void main(String[] args) {
       
        PersonaService persona = new PersonaService();
        
        persona.crearPersona();
        
        persona.calcularEdad();
        
        System.out.println(persona.menorQue(16));
        
        persona.mostrarPersona();
        
    }
    
}
