package ejercicio7poo;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio7POO {

    public static void main(String[] args) {
        
        double[] imc = new double[4];
        boolean[] mayoria = new boolean[4];
        
        //Instanciar personas.
        Persona persona1 = PersonaService.crearPersona();
        
        Persona persona2 = PersonaService.crearPersona();
        
        Persona persona3 = PersonaService.crearPersona();
        
        Persona persona4 = PersonaService.crearPersona();
        
        
        //Calcular IMC y Mayorías de edad.
        imc[0] = PersonaService.calcularIMC(persona1);
        mayoria[0] = PersonaService.esMayorDeEdad(persona1);
        
        imc[1] = PersonaService.calcularIMC(persona2);
        mayoria[1] = PersonaService.esMayorDeEdad(persona2);
        
        imc[2] = PersonaService.calcularIMC(persona3);
        mayoria[2] = PersonaService.esMayorDeEdad(persona3);
        
        imc[3] = PersonaService.calcularIMC(persona4);
        mayoria[3] = PersonaService.esMayorDeEdad(persona4);
    
        //Promedios IMC y Mayoría edad.
        int debajo = 0, ideal = 0, encima = 0;
        int mayor = 0, menor = 0;
        
        for (int i = 0; i < 4; i++) {
            
            //IMC.            
            if (imc[i] == 0) {
                
                ++ideal;

            } else if (imc[i] < 0) {
                
                ++debajo;
                
            } else {
                
                ++encima;
                
            }
            
            //Mayoría.
            if (mayoria[i] == true) {
                
                ++mayor;

            } else {
                
                ++menor;
                
            }
            
        }
        
        System.out.println("Porcentaje de personas por debajo de su peso ideal: " + (debajo / 4.0) * 100 + "%.");
        
        System.out.println("Porcentaje de personas con peso ideal: " + (ideal / 4.0) * 100 + "%.");
        
        System.out.println("Porcentaje de personas por sobre su peso ideal: " + (encima / 4.0) * 100 + "%.");
        
        System.out.println("Porcentaje de mayores de edad: " + (mayor / 4.0) * 100 + "%.");
        
        System.out.println("Porcentaje de menores de edad: " + (menor / 4.0) * 100 + "%.");
   
    }
    
}
