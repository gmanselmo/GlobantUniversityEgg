package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class PersonaService {
    
    public static String genero() {
        
        Scanner scanner = new Scanner(System.in);
        
        String ingreso;
                
        while (true) {
            
            ingreso = scanner.nextLine();
            
            if ((ingreso.equalsIgnoreCase("H")) || (ingreso.equalsIgnoreCase("M")) || (ingreso.equalsIgnoreCase("O"))) {

                break;
                
            } else {
                
                System.out.println("Ingreso incorrecto.");
                
            }
            
        }
        
        return ingreso;        
   
    }
    
    public static Persona crearPersona() {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre, edad, sexo, peso y altura en orden: ");
        
        String nombre = ingreso.nextLine();
        int edad = ingreso.nextInt();
        String sexo = genero();
        double peso = ingreso.nextDouble();
        double altura = ingreso.nextDouble();
        
        Persona persona = new Persona(nombre, edad, sexo, peso, altura);
        
        return persona;
        
    }
    
    public static int calcularIMC(Persona persona) {
        
        double calculo = (persona.getPeso()/(Math.pow(persona.getAltura(), 2)));
        
        if (calculo < 20) {
            
            return -1;
                    
        } else if (calculo > 25) {
            
            return 1;
            
        } else {
            
            return 0;
        
        }
            
    }
    
    
    public static boolean esMayorDeEdad(Persona persona) {
        
        if (persona.getEdad() >= 18) {
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
        
}
