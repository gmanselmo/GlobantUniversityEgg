package Servicios;

import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class TrianguloService {
    
    Scanner ingreso = new Scanner(System.in);
    
    Triangulo triangulo = new Triangulo();
    
    public void operacionTriangulo() {
        
        Double perimetro, area;
        
        System.out.println("Ingrese en orden los tres lados comenzando por la base y luego la altura del triángulo: ");
        
        triangulo.setLado1(ingreso.nextDouble());
        
        triangulo.setLado2(ingreso.nextDouble());
        
        triangulo.setLado3(ingreso.nextDouble());
        
        triangulo.setAltura(ingreso.nextDouble());
        
        perimetro = triangulo.getLado1() + triangulo.getLado2() + triangulo.getLado3();
        
        area = (triangulo.getLado1() * triangulo.getAltura()) / 2;
        
        System.out.println("El área del triángulo es: " + area + " y el perímetro es " + perimetro + ".");

    }
    
}
