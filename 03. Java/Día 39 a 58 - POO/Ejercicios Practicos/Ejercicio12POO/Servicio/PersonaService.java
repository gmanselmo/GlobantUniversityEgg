package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class PersonaService {
    
    Persona persona = new Persona();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void crearPersona(){
        System.out.println("Ingrese el nombre de la persona:");
        
        persona.setNombre(ingreso.nextLine());
        
        System.out.println("Ingrese el año, mes y día de nacimiento de la persona:");
        
        Date fecha = new Date((ingreso.nextInt() - 1900), (ingreso.nextInt() - 1), ingreso.nextInt());

        persona.setFechaNacimiento(fecha);
        
    }
    
    public int calcularEdad(){
        
        Date fechaActual = new Date();
        
        int edad = fechaActual.getYear() - (persona.getFechaNacimiento().getYear() - 1900);
        
        System.out.println("La edad de la persona es de " + edad + " años.");
 
        return edad;
        
    }
    
    public boolean menorQue(int otraEdad){
        
        if (calcularEdad() > otraEdad) {
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
    
    public void mostrarPersona() {
      
        System.out.println(persona.toString());
        
    }

}
