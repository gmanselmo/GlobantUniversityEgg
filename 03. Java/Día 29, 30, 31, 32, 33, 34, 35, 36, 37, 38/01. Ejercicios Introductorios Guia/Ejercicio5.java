package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio5 {

    public static void main(String args[]) {
        
        //Definir el scanner.       
        Scanner leer = new Scanner(System.in);
        
        //Leer una cadena.        
        System.out.println("Ingrese una cadena:");
        String cadena = leer.nextLine();
        System.out.println(cadena);
        
        //Leer un booleano.        
        System.out.println("Ingrese un booleano:");
        boolean booleano = leer.nextBoolean();
        System.out.println(booleano);
              
        //Leer un double.        
        System.out.println("Ingrese un real:");
        double doble = leer.nextDouble();
        System.out.println(doble);

    }
}
