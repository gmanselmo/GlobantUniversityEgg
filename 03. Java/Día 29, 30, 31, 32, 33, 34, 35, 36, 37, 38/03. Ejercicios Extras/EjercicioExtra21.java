package ejercicios.extra;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra21 {
    
    public static void main(String[] args) {
               
        int alumnosEgg = 10;
        
        float[][] calificaciones = new float[10][5];
        
        cargarNotas(calificaciones, alumnosEgg);
        
        imprimirNotas(calificaciones, alumnosEgg);
        
        calcularAproDesaprobados(calificaciones, alumnosEgg);
   
    }
        
    public static void cargarNotas (float[][] calificaciones, int alumnosEgg) {
        
        Scanner ingreso = new Scanner(System.in);
        
        float promedio = 0, notaAuxiliar = 0;

        
        for (int i = 0; i < alumnosEgg; i++) {
            
            System.out.println("Alumno " + (i + 1) + ".");
            
            System.out.println("Ingrese la calificación de los TP1, TP2, Parcial1 y Parcial2 del alumno " + (i + 1) + ".");

            for (int j = 0; j < 4; j++) {
                
                float nota = ingreso.nextFloat();
                
                switch (j) {
                    
                    case 0:
                        notaAuxiliar = ((100+10)/100) * nota; //1.10 * nota.
                        break;
                    
                    case 1:
                        notaAuxiliar = ((100+15)/100) * nota; //1.15 * nota.
                        break;
                        
                    case 2:
                        notaAuxiliar = ((100+25)/100) * nota; //1.25 * nota.
                        break;
                    
                    case 3:
                        notaAuxiliar = ((100+50)/100) * nota; //1.50 * nota.
                        break;
        
                }
                
                if (j < 3) {

                    calificaciones[i][j] = notaAuxiliar;
                    
                    promedio = promedio + notaAuxiliar;
                    
                } else {
                    
                    calificaciones[i][j] = notaAuxiliar;
                    
                    promedio = (promedio + notaAuxiliar) / 4;
                    
                    calificaciones[i][4] = promedio;
                    
                }
                
            }
            
            promedio = 0;
            
            notaAuxiliar = 0;
            
        }
                
    }
    
    public static void imprimirNotas (float[][] calificaciones, int alumnosEgg) {
        
        for (int i = 0; i < alumnosEgg; i++) {
            
            System.out.print(" | ");
            
            for (int j = 0; j < 5; j++) {
                
                System.out.print(calificaciones[i][j] + " | ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    public static void calcularAproDesaprobados (float[][] calificaciones, int alumnosEgg) {
        
        int aprobados = 0, desaprobados = 0;
        
        for (int i = 0; i < alumnosEgg; i++) {
                
            if (calificaciones[i][4] >= 7) {

                ++aprobados;

            } else {

                ++desaprobados;

            }
            
        }
        
        System.out.println("La cantidad de aprobados es de " + aprobados + " alumnos; y la de desaprobados es de " + desaprobados + " alumnos.");
        
    }
    
}
