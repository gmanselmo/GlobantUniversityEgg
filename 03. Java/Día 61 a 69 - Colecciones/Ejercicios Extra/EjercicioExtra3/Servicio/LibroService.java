package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class LibroService {
    
    HashSet<Libro> libreria = new HashSet<Libro>();
    
    Scanner ingreso = new Scanner(System.in);
    
    
    public void crearLibro(){
        
        String input = "no";
        
        while (!input.equalsIgnoreCase("salir")) {
            
            Libro libro = new Libro();
        
            System.out.println("Ingrese el nombre del libro o 'salir': ");

            input = ingreso.nextLine();
            
            if (input.equalsIgnoreCase("salir")) {
                
                break;
                
            } else {
                
                libro.setTitulo(input);
                
                System.out.println("Ingrese el autor: ");

                libro.setAutor(ingreso.nextLine());

                System.out.println("Ingrese el numero de ejemplares: ");

                libro.setNumeroEjemplares(ingreso.nextInt());

                System.out.println("Ingrese la cantidad de prestados: ");

                libro.setEjemplaresPrestados(ingreso.nextInt());

                ingreso.nextLine();

                libreria.add(libro);
                
            }

        }
        
    }
    
    public void librosDisponibles(){
        
        for (Libro libro : libreria) {
            
            System.out.println(libro);
            
        }
        
    }
    
    public void prestamo() {
        
        String libroPrestamo;

        System.out.println("Ingrese un libro a prestar: ");

        libroPrestamo = ingreso.nextLine();

        boolean encontrado = false;

        for (Libro libro : libreria) {

            if (libro.getTitulo().equalsIgnoreCase(libroPrestamo)) {

                if (libro.getEjemplaresPrestados() < libro.getNumeroEjemplares()) {

                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);

                    System.out.println("Prestamo realizado con éxito.");

                } else {

                    System.out.println("No se cuenta con stock para realizar el préstamo.");

                }

                encontrado = true;
                
                break;
            }
        }

        if (!encontrado) {
            
            System.out.println("Libro no existente.");
            
        }
        
    }
    
    public void devolucion(){
        
        String libroDevolucion;
        
        int contador = 0;        
        
        System.out.println("Ingrese un libro a devolver: ");
        
        libroDevolucion = ingreso.nextLine();
        
        for (Libro libro : libreria) {
            
            if (libro.getTitulo().equalsIgnoreCase(libroDevolucion)) {
                
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                    
                System.out.println("Devolución éxitosa.");
                
                contador++;
                
            }
            
        }
        
        if (contador == 0) {

            System.out.println("Libro no existente.");

        }
        
    }
    
}
