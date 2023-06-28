package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CursoService {
    
    Curso curso = new Curso();
    
    Scanner ingreso = new Scanner(System.in);

    public String[] cargarAlumnos() {
        
        String[] alumnos = new String[5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese el nombre del alumno:");
            
            alumnos[i] = ingreso.nextLine();
            
        }
        
        return alumnos;
        
    }
    
    public void crearCurso(){

        System.out.println("Ingrese el nombre del curso: ");

        curso.setNombreCurso(ingreso.nextLine());

        System.out.println("Ingrese la cantidad de horas por día: ");

        curso.setCantidadHorasPorDia(ingreso.nextInt());
        
        System.out.println("Ingrese la cantidad de días por semana: ");

        curso.setCantidadDiasPorSemana(ingreso.nextInt());
        
        ingreso.nextLine();
        
        System.out.println("Ingrese el turno (mañana/tarde): ");
        
        curso.setTurno(ingreso.nextLine());
                
        System.out.println("Ingrese el precio por hora: ");

        curso.setPrecioPorHora(ingreso.nextInt());
        
        ingreso.nextLine();
        
        curso.setAlumnos(cargarAlumnos());
        
        
    }
    
    public void calcularGananciaSemanal(){
              
        int ganancias = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * 5 * curso.getCantidadDiasPorSemana();
        
        System.out.println("La ganancia semanal del curso es de $" + ganancias + ".");

    }
    
    public void imprimir(){
        
        System.out.println(curso.toString(Arrays.toString(curso.getAlumnos())));
        
    }

}
