package ejercicio8poo;

import Servicios.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio8POO {

    public static void main(String[] args) {

        CadenaService cadena1 = new CadenaService();
        
        Scanner ingreso = new Scanner(System.in);
        
        cadena1.cargarDatos();
        
        cadena1.mostrarVocales();
        
        cadena1.invertirFrase();
        
        System.out.println("Ingrese una letra: ");
        
        cadena1.vecesRepetido(ingreso.nextLine()); //
        
        System.out.println("Ingrese una frase: ");
        
        cadena1.compararLongitud(ingreso.nextLine());
        
        System.out.println("Ingrese otra frase: ");
        
        cadena1.unirFrases(ingreso.nextLine());
        
        System.out.println("Ingrese una letra: ");
        
        cadena1.reemplazar(ingreso.nextLine());
        
        System.out.println("Ingrese otra letra: ");
        
        System.out.println(cadena1.contiene(ingreso.nextLine()));
               
    }
    
}
