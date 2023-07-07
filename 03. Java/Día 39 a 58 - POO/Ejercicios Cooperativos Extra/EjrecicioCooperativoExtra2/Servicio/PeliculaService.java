package Servicio;

import Entidad.Pelicula;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */
public class PeliculaService {

    private Pelicula[] peliculas;

    private int cantPeliculas;

    Scanner ingreso = new Scanner(System.in);

    public void crearPeliculas() {

        System.out.println("Ingrese la cantidad de películas a cargar: ");

        cantPeliculas = comprobarIngresosNumericos();

        peliculas = new Pelicula[cantPeliculas];

        ingreso.nextLine();

        for (int i = 0; i < cantPeliculas; i++) {

            Pelicula pelicula = new Pelicula();

            System.out.println("Ingrese la pelicula a cargar: ");

            pelicula.setTitulo(ingreso.nextLine());

            System.out.println("Ingrese el género: ");

            pelicula.setGenero(ingreso.nextLine());

            System.out.println("Ingrese el año, mes y dia de la película de la película: ");

            int yyyy = comprobarIngresosNumericos() - 1900;

            int mm = comprobarIngresosNumericos() - 1;

            int dd = comprobarIngresosNumericos();

            Date fecha = new Date(yyyy, mm, dd);

            pelicula.setAnio(fecha);

            System.out.println("Ingrese la duración de la pelicula en minutos (120): ");

            pelicula.setDuracion(comprobarIngresosNumericos());

            ingreso.nextLine();

            peliculas[i] = pelicula;

        }

    }

    public void listarDisponibles() {

        System.out.println("Películas disponibles: ");

        for (int i = 0; i < cantPeliculas; i++) {

            System.out.println(peliculas[i].toString());

        }

    }

    public void buscarTitulo() {

        boolean existencia = false;

        System.out.println("Ingrese el titulo de la pelicula a buscar: ");

        String titulo = ingreso.nextLine();

        for (int i = 0; i < cantPeliculas; i++) {

            if (peliculas[i].getTitulo().equalsIgnoreCase(titulo)) {

                existencia = true;

                break;

            }

        }

        if (existencia) {

            System.out.println(titulo + " existe.");

        } else {

            System.out.println(titulo + " no existe.");
        }

    }

    public void buscarGenero() {

        int contador = 0;

        System.out.println("Ingrese el genero para buscar coincidencias: ");

        String genero = ingreso.nextLine();

        for (int i = 0; i < cantPeliculas; i++) {

            if (peliculas[i].getGenero().equalsIgnoreCase(genero)) {

                ++contador;

                System.out.println(peliculas[i].getTitulo());

            }

        }

        if (contador == 0) {

            System.out.println("No hay películas con ese género.");

        }

    }

    public int comprobarIngresosNumericos() {
        
        while (true) {
            
            if (ingreso.hasNextInt()) {
                
                int input = ingreso.nextInt();
                
                return input;
                
            } else {
                
                System.out.println("Ingrese un valor correcto:");
                
                ingreso.next();
            }
            
        }
        
    }

}
