package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class PersonaService {
    
    Persona persona = new Persona();
    
    public void crearPersona () {
        
        Scanner ingreso = new Scanner(System.in);

         System.out.println("Ingrese el nombre de la persona: ");
         persona.setNombre(ingreso.nextLine());
         
         System.out.println("Ingrese el apellido de la persona: ");
         persona.setApellido(ingreso.nextLine());
         
         System.out.println("Ingrese la edad de la persona: ");
         persona.setEdad(ingreso.nextInt());
         
         System.out.println("Ingrese el documento de la persona: ");
         persona.setDocumento(ingreso.nextInt());

    }
    
    public void asignarPerro(PerroService perroservice) {
        
        persona.setPerro(perroservice.perro);
        
    }
    
    public static void mostrarPersona(PersonaService persona) {
        
        System.out.println(persona.persona);
        
    }
    
}
