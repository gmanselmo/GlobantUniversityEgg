package Servicio;

import Entidad.Persona;

/**
 *
 * @author Germán Anselmo.
 */

public class UnoAUnoService {
    
    Persona persona = new Persona();
            
    public void accesoDatos(){

        persona.setNombre("Floripondia");
        
        persona.setApellido("Martinez");
        
        persona.getDni().setSerie('f');
        
        persona.getDni().setNumero(12345678);
        
    }
    
    public void mostrarDatos(){
        
        System.out.println(persona);
        
    } 
    
}
