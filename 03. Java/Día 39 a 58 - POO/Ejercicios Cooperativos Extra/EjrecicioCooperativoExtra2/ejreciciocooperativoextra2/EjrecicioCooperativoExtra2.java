package ejreciciocooperativoextra2;

import Servicio.AlquilerService;
import Servicio.PeliculaService;
import java.util.Scanner;

public class EjrecicioCooperativoExtra2 {

    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        PeliculaService listadoPeliculas = new PeliculaService();

        AlquilerService listadoAlquiladas = new AlquilerService();

        boolean encendido = true;

        while (encendido) {

            menu();

            System.out.println("Ingrese una opción: ");

            int opcion = ingreso.nextInt();

            ingreso.nextLine();

            switch (opcion) {

                case 1:
                    listadoPeliculas.crearPeliculas();
                    break;

                case 2:
                    listadoPeliculas.listarDisponibles();
                    break;

                case 3:
                    listadoAlquiladas.crearAlquileres();
                    break;

                case 4:
                    listadoAlquiladas.listarDisponibles();
                    break;

                case 5:
                    listadoPeliculas.buscarTitulo();
                    break;

                case 6:
                    listadoPeliculas.buscarGenero();
                    break;

                case 7:
                    listadoAlquiladas.buscarAlquilerFecha();
                    break;

                case 8:
                    System.out.println("Gracias por usar.");
                    encendido = false;

            }

        }

    }

    public static void menu() {

        System.out.println("--------------------------------------");

        System.out.println("1- Cargar Peliculas.");

        System.out.println("2- Listar Peliculas.");

        System.out.println("3- Cargar Alquileres.");

        System.out.println("4- Listar Alquileres.");

        System.out.println("5- Buscar Películas por Título.");

        System.out.println("6- Buscar Películas por Género.");

        System.out.println("7- Buscar Alquileres por Fecha.");

        System.out.println("8- Salir.");

        System.out.println("--------------------------------------");

    }

}
