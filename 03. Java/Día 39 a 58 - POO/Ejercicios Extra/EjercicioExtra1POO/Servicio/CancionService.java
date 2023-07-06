package Servicio;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CancionService {
    
    Cancion cancion = new Cancion();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void cargarCancion(){
        
        System.out.println("Ingrese el nombre de la canción y luego el autor:");
        
        cancion.setTitulo(ingreso.nextLine());
        
        cancion.setAutor(ingreso.nextLine());

    }
    
    public void mostrarCancion(){
        
        System.out.println(cancion.toString());
        
    }
    
}
