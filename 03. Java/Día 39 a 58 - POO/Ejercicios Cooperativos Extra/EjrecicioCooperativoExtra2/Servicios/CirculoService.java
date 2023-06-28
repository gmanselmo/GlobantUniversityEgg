package Servicios;

import Entidades.Circulo;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CirculoService {
    
    Scanner ingreso = new Scanner(System.in);
    
    Circulo circulo = new Circulo();
    
    public void operacionCirculo() {
        
        Double perimetro, area;
        
        System.out.println("Ingrese el radio del circulo: ");
        
        circulo.setRadio(ingreso.nextDouble());
        
        perimetro = 2 * Math.PI * circulo.getRadio();
        
        area = Math.PI * Math.pow(circulo.getRadio(), 2);
        
        System.out.println("El área del circulo es: " + area + " y el perímetro es " + perimetro + ".");

    }
    
}
