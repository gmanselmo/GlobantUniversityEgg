package ejreciciocooperativoextra2;

import Servicios.CirculoService;
import Servicios.CuadradoService;
import Servicios.HexagonoService;
import Servicios.PentagonoService;
import Servicios.RectanguloService;
import Servicios.RomboService;
import Servicios.TrianguloService;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjrecicioCooperativoExtra2 {

    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Seleccione una figura a procesar:");
        System.out.println("---------------------------------");
        System.out.println("1 - Circulo.");
        System.out.println("2 - Cuadrado.");
        System.out.println("3 - Hexágono.");
        System.out.println("4 - Pentágono.");
        System.out.println("5 - Rectángulo.");
        System.out.println("6 - Rombo.");
        System.out.println("7 - Triángulo");
        System.out.println("---------------------------------");
        
        int eleccion = ingreso.nextInt();
        
        switch (eleccion) {
            case 1:
                CirculoService circulo = new CirculoService();
                circulo.operacionCirculo();
                break;
                
            case 2:
                CuadradoService cuadrado = new CuadradoService();
                cuadrado.operacionCuadrado();
                break;
                
            case 3:
                HexagonoService hexagono = new HexagonoService();
                hexagono.operacionHexagono();
                break;
            
            case 4:
                PentagonoService pentagono = new PentagonoService();
                pentagono.operacionPentagono();
                break;
                
            case 5:
                RectanguloService rectangulo = new RectanguloService();
                rectangulo.operacionRectangulo();
                break;
            
            case 6:
                RomboService rombo = new RomboService();
                rombo.operacionRombo();
                break;
                
            case 7:
                TrianguloService triangulo = new TrianguloService();
                triangulo.operacionTriangulo();
                break;
                
            default:
                break;
     
        }

    }
    
}
