package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class MesesService {
    
    Meses meses = new Meses();
    
    Scanner ingreso = new Scanner(System.in);
    
    public String generarMesSecreto() {
        
        int random = (int) (Math.random() * 12);
    
        return meses.getMes()[random];

    }
    
    public void adivinarMesSecreto() {
        
        String mesSecreto = generarMesSecreto();
     
        String ingresado = "";
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        
        while (!ingresado.equalsIgnoreCase(mesSecreto)) {
                        
            ingresado = ingreso.nextLine();

            if (ingresado.equalsIgnoreCase(mesSecreto)) {
                
                System.out.println("¡Ha acertado!");
                
                break;
                
            } else {
                
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                
            }
            
        }

    }
    
}
