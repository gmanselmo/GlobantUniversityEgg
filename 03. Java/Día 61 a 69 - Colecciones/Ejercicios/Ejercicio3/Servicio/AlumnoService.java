package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class AlumnoService {
    
    private ArrayList<Alumno> alumnos = new ArrayList();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void cargarAlumnos(){
        
        String exit = "no", input;
        
        while (exit.equals("no")) {
            
            Alumno alumno = new Alumno();
            
            System.out.println("Ingrese el nombre del alumno o 'salir':");
            
            input = ingreso.nextLine();
            
            if (input.equalsIgnoreCase("salir")) {
                
                break;
                
            } else {
                
                alumno.setNombre(input);
            
                for (int i = 0; i < 3; i++) {

                    System.out.println("Ingrese la nota " + (i + 1) + " de " + alumno.getNombre() + ":");

                    alumno.getNotas().add(ingreso.nextInt());

                }
                
                ingreso.nextLine();
                
                alumnos.add(alumno);
                
            }
          
        }
        
    }
    
    public void notaFinal(){

        double promedio = 0;
        
        System.out.println("Ingrese el nombre de un alumno:");
        
        for (Alumno alumno : alumnos) {
            
           if (alumno.getNombre().equalsIgnoreCase(ingreso.nextLine())) {
               
               for (Integer nota : alumno.getNotas()) {
                   
                   promedio += nota;
               }
               
               System.out.println("El promedio final de " + alumno.getNombre() + " es " + (promedio / 3) + ".");
               
           }
           
           break;
            
        }
    }
    
}
