package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra1 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de tiempo en minutos:");
        
        int tiempo = ingreso.nextInt();
        
        int horas = tiempo / 60;
        
        int dias = horas / 24;
        
        horas = horas % 24;
                
        System.out.println("El equivalente de " + tiempo + " minutos es de " + dias + " dìas y " + horas + " horas.");
        
    }
    
}
