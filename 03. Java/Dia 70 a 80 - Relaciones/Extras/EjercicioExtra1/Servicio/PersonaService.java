package Servicio;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class PersonaService {
    
    ArrayList<Persona> adoptantes = new ArrayList();
    
    public void crearPersona () {
        
        Persona persona = new Persona();        
        Scanner ingreso = new Scanner(System.in);

         System.out.println("Ingrese el nombre de la persona: ");
         persona.setNombre(ingreso.nextLine());
         
         System.out.println("Ingrese el apellido de la persona: ");
         persona.setApellido(ingreso.nextLine());
         
         System.out.println("Ingrese la edad de la persona: ");
         persona.setEdad(ingreso.nextInt());
         
         System.out.println("Ingrese el documento de la persona: ");
         persona.setDocumento(ingreso.nextInt());
         
         adoptantes.add(persona);

    }
    
    public void mostrarPersonas() {
        
        for (Persona adoptante : adoptantes) {
            
            System.out.println(adoptante);
            
        }
        
    }
    
}
