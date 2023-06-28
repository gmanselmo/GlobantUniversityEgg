package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CafeteraService {
    
    public static Cafetera encenderCafetera() {
        
        Cafetera cafetera = new Cafetera();
        
        return cafetera;
        
    }
    
    public static void llenarCafetera(Cafetera cafetera) {
        
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        
        System.out.println("Cafetera llena.");
        
    }
    
    public static void servirTaza(int capacidadTaza, Cafetera cafetera) {
        
        System.out.println("...Sirviendo...");
        
        if (cafetera.getCantidadActual() <= capacidadTaza) {
            
            System.out.println("La taza no se llenó. La taza se cargó solo con " + cafetera.getCantidadActual() + ".");
            
            cafetera.setCantidadActual(0);

        } else {
            
            System.out.println("La taza se llenó.");
            
            cafetera.setCantidadActual(cafetera.getCantidadActual() - capacidadTaza);
            
        }  
        
    }
    
    public static void vaciarCafetera(Cafetera cafetera) {
        
        cafetera.setCantidadActual(0);
                
    }
    
    public static void agregarCafe(int cantidadCafe, Cafetera cafetera) {
        
        if ((cantidadCafe <= cafetera.getCapacidadMaxima()) && (cantidadCafe + cafetera.getCantidadActual() <= cafetera.getCapacidadMaxima())) {
            
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
            
            System.out.println(cantidadCafe + " fueron agregados a la cafetera.");
            
        } else {
            
            System.out.println("La cafetera no cuenta con tanta capacidad, ingrese una cantidad inferior de café.");
        }
        
    }

}
