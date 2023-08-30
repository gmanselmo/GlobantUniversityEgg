package Servicio;

import Entidad.Perrera;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
    
    public void eliminarRaza() {
        
        String raza;
        
        int contador = 0;
        
        System.out.println("Ingrese una raza a buscar y eliminar:");
        
        raza = ingreso.nextLine();
        
        Iterator<String> iterator = perrera.getListaPerros().iterator();
        
        while (iterator.hasNext()) {
            
              if (iterator.next().equals(raza)) {
                  
                  iterator.remove();
                  
                  contador++;
                  
              }
              
        }
                        
        if (!(contador == 0)){
            
            System.out.println("Raza eliminado.");
            
        } else {
            
            System.out.println("Raza no encontrada.");
            
        }
        
        Collections.sort(perrera.getListaPerros());
        
        mostrarPerrera();
        
    }
    
}
