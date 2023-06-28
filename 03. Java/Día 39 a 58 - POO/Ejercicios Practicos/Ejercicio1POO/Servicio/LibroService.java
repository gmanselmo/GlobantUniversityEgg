package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class LibroService {
    
    
    
    public static Libro cargarLibro() {
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN, título, autor y n. de páginas del libro en orden:");
        
        int isbn = ingreso.nextInt();
        ingreso.next();
        String titulo = ingreso.nextLine();
        String autor = ingreso.nextLine();
        int cantPaginas = ingreso.nextInt();

        Libro libro = new Libro(isbn, titulo, autor, cantPaginas);
        
        return libro;
        
    }
    
    
    
    public static void imprimirDatos(Libro libro) {
        
        System.out.println(libro);
        
    }
    
}
