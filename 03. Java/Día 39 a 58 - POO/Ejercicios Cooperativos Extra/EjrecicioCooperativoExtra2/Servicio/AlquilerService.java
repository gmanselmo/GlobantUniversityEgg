package Servicio;

import Entidad.Alquiler;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class AlquilerService {

    private Alquiler[] alquiladas;

    private int cantAlquiladas;

    Scanner ingreso = new Scanner(System.in);

    public void crearAlquileres() {

        System.out.println("Ingrese la cantidad de películas a alquilar: ");

        cantAlquiladas = comprobarIngresosNumericos();

        alquiladas = new Alquiler[cantAlquiladas];

        ingreso.nextLine();

        for (int i = 0; i < cantAlquiladas; i++) {

            Alquiler alquiler = new Alquiler();

            System.out.println("Ingrese la pelicula a alquilar: ");

            alquiler.setPelicula(ingreso.nextLine());

            System.out.println("Ingrese la fecha de inicio del alquiler (año, mes y dia) en orden:");

            int yyyy = comprobarIngresosNumericos() - 1900;

            int mm = comprobarIngresosNumericos() - 1;

            int dd = comprobarIngresosNumericos();

            Date fecha = new Date(yyyy, mm, dd);

            alquiler.setFechaInicio(fecha);

            System.out.println("Ingrese la fecha de fin del alquiler (año, mes y dia) en orden:");

            yyyy = comprobarIngresosNumericos() - 1900;

            mm = comprobarIngresosNumericos() - 1;

            dd = comprobarIngresosNumericos();

            ingreso.nextLine();

            fecha = new Date(yyyy, mm, dd);

            alquiler.setFechaFin(fecha);

            costoServicio(alquiler);

            alquiladas[i] = alquiler;

        }

    }

    public void listarDisponibles() {

        System.out.println("Películas alquiladas: ");

        for (int i = 0; i < cantAlquiladas; i++) {

            System.out.println(alquiladas[i].toString());

        }

    }

    public void buscarAlquilerFecha() {

        boolean existencia = false;

        System.out.println("Ingrese el año, mes y día de la pelicula alquilada a buscar: ");

        Date fecha = new Date((comprobarIngresosNumericos() - 1900), (comprobarIngresosNumericos() - 1), comprobarIngresosNumericos());

        for (int i = 0; i < cantAlquiladas; i++) {

            if (alquiladas[i].getFechaInicio().equals(fecha)) {

                existencia = true;

                System.out.println(alquiladas[i].toString());

            }

        }

        if (existencia == false) {

            System.out.println("No disponible.");

        }

    }

    public void costoServicio(Alquiler alquiler) {

        long milisegundos = alquiler.getFechaFin().getTime() - alquiler.getFechaInicio().getTime();
        
        int dias = (int) (milisegundos / (1000 * 60 * 60 * 24));
        
        System.out.println(dias);

        if (dias <= 3) {

            alquiler.setPrecio(10);

        } else {

            double precio = 10 + (10 * 0.1 * (dias - 3));

            alquiler.setPrecio(precio);

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

