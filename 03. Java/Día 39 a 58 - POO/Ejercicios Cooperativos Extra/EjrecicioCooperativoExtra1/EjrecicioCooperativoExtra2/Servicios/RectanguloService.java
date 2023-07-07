package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class RectanguloService {
    
    Scanner ingreso = new Scanner(System.in);
    
    Rectangulo rectangulo = new Rectangulo();
    
    public void operacionRectangulo() {
        
        Double perimetro, area;
        
        System.out.println("Ingrese la base y luego la altura del rectángulo: ");
        
        rectangulo.setBase(ingreso.nextDouble());
        
        rectangulo.setAltura(ingreso.nextDouble());
        
        perimetro = 2 * (rectangulo.getBase() + rectangulo.getAltura());
        
        area = rectangulo.getBase() * rectangulo.getAltura();
        
        System.out.println("El área del rectangulo es: " + area + " y el perímetro es " + perimetro + ".");

    }
    
}
