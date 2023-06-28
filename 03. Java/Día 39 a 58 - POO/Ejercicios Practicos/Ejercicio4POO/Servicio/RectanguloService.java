package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class RectanguloService {
    
    public static Rectangulo crearRectangulo() {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese la base y la altura del triangulo:");
                
        Rectangulo rectangulo = new Rectangulo(ingreso.nextInt(), ingreso.nextInt());
        
        return rectangulo;
    
    }
    
    public static void superficie(Rectangulo rectangulo) {
        
        System.out.println("Superficie: " + rectangulo.getBase() * rectangulo.getAltura());
        
    }
    
    public static void perimetro(Rectangulo rectangulo) {
        
        System.out.println("Perímetro: " + (rectangulo.getBase() + rectangulo.getAltura()) * 2);
        
    }
    
    public static void dibujarRectangulo(Rectangulo rectangulo) {
        
        int base = (int) rectangulo.getBase();
        int altura = (int) rectangulo.getAltura();
      
        for (int i = 0; i <= altura - 1; i++ ) {
            
            for (int j = 0; j <= base - 1; j++) {
                
                if ((i == 0) || (i == altura - 1)) {
                    
                    System.out.print("*");
                    
                } else if ((j == 0) || (j == base - 1)) {
                    
                    System.out.print("*");
                    
                } else {
                    
                    System.out.print(" ");
                    
                }
                
            }
            
            System.out.println("");
            
        }
      
    }
    
}
