package Servicios;

import Entidades.Rombo;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class RomboService {
    
    Scanner ingreso = new Scanner(System.in);
    
    Rombo rombo = new Rombo();
    
    public void operacionRombo() {
        
        Double perimetro, area;
        
        System.out.println("Ingrese el lado, la diagonal chica y la diagonal grande del rombo: ");
        
        rombo.setLado(ingreso.nextDouble());
        
        rombo.setDiagonalChica(ingreso.nextDouble());
        
        rombo.setDiagonalGrande(ingreso.nextDouble());
        
        perimetro = 4 * rombo.getLado();
        
        area = (rombo.getDiagonalChica() * rombo.getDiagonalGrande()) / 2;
        
        System.out.println("El área del rombo es: " + area + " y el perímetro es " + perimetro + ".");

    }
    
}
