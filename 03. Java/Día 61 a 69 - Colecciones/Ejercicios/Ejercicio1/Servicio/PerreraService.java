package Servicio;

import Entidad.Perrera;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class PerreraService {
    
    Perrera perrera = new Perrera();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void cargarPerrera() {
        
        String raza;
        
        ArrayList<String> perreraAdicional;
        
        while (true) {
            
            System.out.println("Ingrese una raza de perro o 'salir':");
            
            raza = ingreso. nextLine();
            
            if (raza.equalsIgnoreCase("salir")) {
                
                break;
                
            } else {
                
               perrera.getListaPerros().add(raza);

            }
            
        }
        
    }
    
    public void mostrarPerrera(){
        
        System.out.println(perrera.toString());
        
    }
    
}
