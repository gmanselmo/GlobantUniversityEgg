package Servicio;

import Entidad.CodigosPostales;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CodigosPostalesService {
    
    Scanner ingreso = new Scanner(System.in);
    
    CodigosPostales cp = new CodigosPostales();

    public void cargarCodigos(String ciudad, Integer codigo){
        
        cp.getCodigospostales().put(codigo, ciudad);
        
    }
    
    public void solicitarDatos(){
        
        Integer codigoPostal;
        String ciudad;
                
        System.out.println("Ingrese el código postal: ");
        
        codigoPostal = ingreso.nextInt();
        
        ingreso.nextLine();
        
        System.out.println("Ingrese el nombre de la ciudad:");
        
        ciudad = ingreso.nextLine();
        
        cargarCodigos(ciudad, codigoPostal);
        
    }
    
    public void almacenarDiez() {
        cargarCodigos("Aldo Bonzi", 1786);
        
        cargarCodigos("Cioudad Evita", 1788);
        
        cargarCodigos("Ciudad Madero", 1768);
        
        cargarCodigos("Gonzáles Catán", 1758);
        
        cargarCodigos("Gonzales Catan", 1759);
        
        cargarCodigos("Gregorio de Laferrere", 1757);
        
        cargarCodigos("Isidro Casanova", 1765);
        
        cargarCodigos("La Salada", 1744);
        
        cargarCodigos("Lomas del Mirador", 1752);
        
        cargarCodigos("Mercado Central", 1771);
        
    }
    
    public void mostrarCiudades(){
        
        for (Map.Entry<Integer, String> entry : cp.getCodigospostales().entrySet()) {
            
            System.out.println(entry);
 
        }
        
    }
    
    public void buscarPorCodigo() {
        
        int counter = 0;
        
        System.out.println("Busque una ciudad por su códgio postal: ");
        
        int ingresado = ingreso.nextInt();
        
        ingreso.nextLine();
        
        for (Map.Entry<Integer, String> entry : cp.getCodigospostales().entrySet()) {

            if (ingresado == entry.getKey()) {
                
                System.out.println("Ciudad: " + entry.getValue() + ".");
                
                counter++;
                
                break;
                
            } 
            
        }
        
        if (counter == 0) {
            
            System.out.println("No se encontro una ciudad.");
            
        }
        
    }
    
    public void eliminarCiudad() { 
        
        int counter = 0;

        System.out.println("Elimine una ciudad por su nombre: ");

        String ingresado = ingreso.nextLine();

        Iterator<Map.Entry<Integer, String>> iterator = cp.getCodigospostales().entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<Integer, String> entry = iterator.next();

            if (entry.getValue().equalsIgnoreCase(ingresado)) {

                iterator.remove();

                System.out.println("Ciudad: " + entry.getValue() + " eliminada.");

                counter++;

            } 

        }

        if (counter == 0) {

            System.out.println("No se encontro una ciudad.");

        }

    }

}
