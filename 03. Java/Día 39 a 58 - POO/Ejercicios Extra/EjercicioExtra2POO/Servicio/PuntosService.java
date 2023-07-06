package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class PuntosService {
    
    Puntos puntos = new Puntos();
    
    Scanner ingreso = new Scanner(System.in);
        
    public void crearPuntos() {
        
        System.out.println("Ingrese en orden números enteros para x1, y1, x2, y2: ");
        
        puntos.setX1(ingreso.nextInt());
        
        puntos.setY1(ingreso.nextInt());
        
        puntos.setX2(ingreso.nextInt());
        
        puntos.setY2(ingreso.nextInt());

    }
    
    public Double distanciaEntrePares(){
        
        return Math.sqrt(Math.pow(puntos.getX2()- puntos.getX1(), 2) + Math.pow(puntos.getY2() - puntos.getY1(), 2));
        
    }
    
}
