package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class MovilService {
    
    Movil movil = new Movil();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void cargarCelular() {
        
        System.out.println("Ingrese la marca:");
        
        movil.setMarca(ingreso.nextLine());
        
        System.out.println("Ingrese el precio:");
        
        movil.setPrecio(ingreso.nextDouble());
        
        ingreso.nextLine();
        
        System.out.println("Ingrese el modelo:");
        
        movil.setModelo(ingreso.nextLine());
        
        System.out.println("Ingrese la ram:");
        
        movil.setMemoriaRam(ingreso.nextInt());
        
        System.out.println("Ingrese el almacenamiento:");
        
        movil.setAlmacenamiento(ingreso.nextInt());

    }
    
    public void ingresarCodigo() {
        
        int[] digitos = new int[7];

        System.out.println("Ingrese de a uno los 7 números que comprenden el código del móvil:");
        
        for (int i = 0; i < 7; i++) {
            
            digitos[i] = ingreso.nextInt();
            
        }
        
        movil.setCodigo(digitos);
        
    }    
    
    public void mostarMovil() {
        
        System.out.println(movil.toString(Arrays.toString(movil.getCodigo())));
        
    }
    
}
