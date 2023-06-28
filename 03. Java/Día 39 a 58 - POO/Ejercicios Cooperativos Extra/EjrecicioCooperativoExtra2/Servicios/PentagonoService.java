package Servicios;

import Entidades.Pentagono;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class PentagonoService {
    
    Scanner ingreso = new Scanner(System.in);
    
    Pentagono pentagono = new Pentagono();
    
    public void operacionPentagono() {
        
        Double perimetro, area;
        
        System.out.println("Ingrese el lado y luego el apotema del pentágono: ");
        
        pentagono.setLado(ingreso.nextDouble());
        
        pentagono.setApotema(ingreso.nextDouble());
        
        perimetro = 5 * pentagono.getLado();
        
        area = (perimetro * pentagono.getApotema()) / 2;
        
        System.out.println("El área del pentágono es: " + area + " y el perímetro es " + perimetro + ".");

    }
    
}
