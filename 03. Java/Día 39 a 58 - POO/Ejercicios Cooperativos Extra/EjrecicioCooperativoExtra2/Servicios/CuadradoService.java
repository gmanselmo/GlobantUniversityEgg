package Servicios;

import Entidades.Cuadrado;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CuadradoService {
    
    Scanner ingreso = new Scanner(System.in);
    
    Cuadrado cuadrado = new Cuadrado();
    
    public void operacionCuadrado() {
        
        Double perimetro, area;
        
        System.out.println("Ingrese el lado del cuadrado: ");
        
        cuadrado.setLado(ingreso.nextDouble());
        
        perimetro = 4 * cuadrado.getLado();
        
        area = Math.pow(cuadrado.getLado(), 2);
        
        System.out.println("El área del cuadrado es: " + area + " y el perímetro es " + perimetro + ".");

    }

}
