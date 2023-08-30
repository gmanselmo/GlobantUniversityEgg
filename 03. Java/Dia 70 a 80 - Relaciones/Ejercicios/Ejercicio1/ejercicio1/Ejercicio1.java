package ejercicio1;

import Servicio.PerroService;
import Servicio.PersonaService;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        PersonaService persona1 = new PersonaService();
        PersonaService persona2 = new PersonaService();
        PerroService perro1 = new PerroService();
        PerroService perro2 = new PerroService();

        persona1.crearPersona();
        persona2.crearPersona();
        perro1.crearPerro();
        perro2.crearPerro();
        
        persona1.asignarPerro(perro1);
        persona2.asignarPerro(perro2);
        
        PersonaService.mostrarPersona(persona1);
        PersonaService.mostrarPersona(persona2);
        
    }
    
}
