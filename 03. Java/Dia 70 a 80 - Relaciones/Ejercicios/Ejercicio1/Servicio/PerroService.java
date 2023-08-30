package Servicio;

import Entidad.Perro;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo.
 */

public class PerroService {
    
    Perro perro = new Perro();

    public void crearPerro(){
        
         Scanner ingreso = new Scanner(System.in);

         System.out.println("Ingrese el nombre del perro: ");
         perro.setNombre(ingreso.nextLine());
         
         System.out.println("Ingrese la raza del perro: ");
         perro.setRaza(ingreso.nextLine());
         
         System.out.println("Ingrese la edad del perro: ");
         perro.setEdad(ingreso.nextInt());
         
         ingreso.nextLine();
         
         System.out.println("Ingrese el tamaño del perro: ");
         perro.setTamanio(ingreso.nextLine());
        
    }
    
}
