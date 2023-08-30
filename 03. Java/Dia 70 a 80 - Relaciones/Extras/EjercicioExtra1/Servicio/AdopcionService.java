package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo
 */

public class AdopcionService {
    
    ArrayList<Perro> yaAdoptados = new ArrayList();    
    Scanner ingreso = new Scanner(System.in);    
    PersonaService personas = new PersonaService();
    PerroService perros = new PerroService();
        
    public void crearEntidades() {
        
        personas.crearPersona();
        personas.crearPersona();
            
        perros.crearPerro();
        perros.crearPerro();
        
    }
    
    public void mostrarEntidades(String tipo) {
        
        switch (tipo) {
            case "perro": 
                for (Perro perro : perros.perrera) {

                    System.out.println(perro);

                }
                break;
            
            case "persona":
                for (Persona persona : personas.adoptantes) {

                    System.out.println(persona);

                }
                break;
        }
        
    }
    
    public void adoptar() {
        Integer personaCounter = 0;
        Integer perroCounter = 0;
        
        System.out.println("Ingrese el dni del adoptante: ");
        
        Integer dniAdoptante = ingreso.nextInt();
        
        ingreso.nextLine();
        
        for (Persona persona : personas.adoptantes) {
            
            if (persona.getDocumento() == dniAdoptante) {
                
                System.out.println("Perros disponibles: ");

                mostrarEntidades("perro");

                System.out.println("Ingrese el nombre del perro a adoptar: ");

                String perritoNombre = ingreso.nextLine();

                for (Perro perro : perros.perrera) {
                    
                    if (perro.getNombre().equalsIgnoreCase(perritoNombre)) {
                        
                        yaAdoptados.add(perro);
                        
                        persona.setPerro(perro);
                        
                        perros.perrera.remove(perro);
                        
                    } else {
                        
                       perroCounter++;
                        
                    }

                }

            } else {
                
                personaCounter++;
                
            }
            
        }
        
        if (personaCounter == personas.adoptantes.size()) {
                
            System.out.println("Persona no econtrada en base de datos.");

        }
        
         if (perroCounter > 0) {
                        
                System.out.println("Perrito no existente o ya adoptado.");

           }

    }
    
}
