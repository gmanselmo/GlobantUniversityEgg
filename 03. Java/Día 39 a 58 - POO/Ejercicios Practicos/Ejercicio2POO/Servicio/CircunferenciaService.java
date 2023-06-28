package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CircunferenciaService {
    
    public static Circunferencia crearCircunferencia() {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese el radio: ");
        
        Circunferencia circunferencia = new Circunferencia(ingreso.nextDouble());
        
        return circunferencia;
                
    }
    
    public static void area(Circunferencia circulo) {
        
        Double area = Math.PI * Math.pow(circulo.getRadio(), 2);
        
        System.out.println("El área es " + area);
        
    }
    
    public static void perimetro(Circunferencia circulo) {
        
        Double perimetro = 2 * Math.PI * circulo.getRadio();
        
        System.out.println("El perímetro es " + perimetro);
        
    }
    
}
