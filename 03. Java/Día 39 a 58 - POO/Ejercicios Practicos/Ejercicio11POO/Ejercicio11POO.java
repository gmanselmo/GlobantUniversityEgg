package ejercicio11poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio11POO {

    public static void main(String[] args) {
        
        int dia, mes, anio;
        
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese un día, un mes y un año:");
        
        dia = ingreso.nextInt();
        
        mes = ingreso.nextInt();
        
        anio = ingreso.nextInt();
        
        //Java cuenta desde el año 1900 y los meses los cuenta arrancando de 0.
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        
        Date fechaActual = new Date();

        System.out.println("Fecha ingresada: " + fecha + ".");

        System.out.println("Fue hace " + (int) (fechaActual.getYear() - fecha.getYear()) + " años.");
        
    }
    
}

