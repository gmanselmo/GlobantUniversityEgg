package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class PeliculaService {
    
    private ArrayList<Pelicula> peliculas = new ArrayList();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void cargarPeliculas(){
        
        String exit = "no", input;
        
        while (exit.equals("no")) {
            
            Pelicula pelicula = new Pelicula();
            
            System.out.println("Ingrese el nombre de la pelicula o 'salir':");
            
            input = ingreso.nextLine();
            
            if (input.equalsIgnoreCase("salir")) {
                
                break;
                
            } else {
                
                pelicula.setTitulo(input);
            
                System.out.println("Ingrese el nombre del autor:");
                
                pelicula.setDirector(ingreso.nextLine());
                
                System.out.println("Ingrese la duracion en horas de la pelicula (ej: 1,20):");
                
                pelicula.setDuracion(ingreso.nextDouble());
                
                ingreso.nextLine();
                
                peliculas.add(pelicula);
                
            }
          
        }
        
        
    }
    
    public void mostrarPeliculas(){
        
        System.out.println("Peliculas:");
        
        listarPeliculas(peliculas);
       
    }
    
    public void peliculasMasUnaHora(){
        
        System.out.println("Películas con duración mayor a 1 hora.");
        
        for (Pelicula pelicula : peliculas) {
            
            if (pelicula.getDuracion() > 1) {
                
                System.out.println(pelicula);
                
            }
            
        }
        
        System.out.println("----------------------------------------");
        
    }
    
    public void duracionMenorMayor(){
        
        System.out.println("Peliculas ordenadas por duración de menor a mayor:");
         
        Comparator<Pelicula> compararPorDuracionAscendente = new Comparator<Pelicula>() {
            
        @Override
        
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            
            return Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion());
            
        }};

        peliculas.sort(compararPorDuracionAscendente);

        listarPeliculas(peliculas);

    }
    
    public void duracionMayorMenor() {
        
        System.out.println("Peliculas ordenadas por duración de mayor a menor:");
        
        Comparator<Pelicula> compararPorDuracionDescendente = new Comparator<Pelicula>() {
            
        @Override
        
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            
            return Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion());
            
        }};

        peliculas.sort(compararPorDuracionDescendente);

        listarPeliculas(peliculas);
        
    }
    
    public void ordenPorTitulo(){
        
        System.out.println("Peliculas ordenadas por titulo:");
   
        Comparator<Pelicula> compararPorTitulo = new Comparator<Pelicula>() {
            
        @Override
        
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            
            return pelicula1.getTitulo().compareToIgnoreCase(pelicula2.getTitulo());
            
        }};

        Collections.sort(peliculas, compararPorTitulo);
 
        listarPeliculas(peliculas);
        
    }
    
    public void ordenPorDirector(){
        
        System.out.println("Peliculas ordenadas por director:");
   
        Comparator<Pelicula> compararPorAutor = new Comparator<Pelicula>() {
            
        @Override
        
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            
            return pelicula1.getDirector().compareToIgnoreCase(pelicula2.getDirector());
            
        }};

        Collections.sort(peliculas, compararPorAutor);

        listarPeliculas(peliculas);
        
    }
    
    private void listarPeliculas(ArrayList<Pelicula> peliculas) {
        
        for (Pelicula pelicula : peliculas) {
            
            System.out.println(pelicula);
            
        }
        
        System.out.println("----------------------------------------"); 

    }
    
}
