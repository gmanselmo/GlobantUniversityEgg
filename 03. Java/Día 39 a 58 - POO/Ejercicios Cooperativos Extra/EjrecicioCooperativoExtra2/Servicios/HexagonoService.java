package Servicios;

import Entidades.Hexagono;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class HexagonoService {
    
    Scanner ingreso = new Scanner(System.in);
    
    Hexagono hexagono = new Hexagono();
    
    public void operacionHexagono() {
        
        Double perimetro, area;
        
        System.out.println("Ingrese el lado y luego el apotema del hexágono: ");
        
        hexagono.setLado(ingreso.nextDouble());
        
        hexagono.setApotema(ingreso.nextDouble());
        
        perimetro = 6 * hexagono.getLado();
        
        area = (perimetro * hexagono.getApotema()) / 2;
        
        System.out.println("El área del hexágono es: " + area + " y el perímetro es " + perimetro + ".");

    }
    
}
