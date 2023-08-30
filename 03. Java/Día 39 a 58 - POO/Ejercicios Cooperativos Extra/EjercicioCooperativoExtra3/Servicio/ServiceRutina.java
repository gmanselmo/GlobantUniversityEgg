package Servicio;

import java.util.ArrayList;

import java.util.Scanner;

import Entidad.Rutina;

public class ServiceRutina {

    Scanner ingreso = new Scanner(System.in);

    ArrayList<Rutina> ListaRutinas = new ArrayList<>();

    public void registrarRutina() {

        Rutina rutina = new Rutina();

        System.out.println("Ingrese el ID de la rutina:");

        rutina.setId(ingreso.nextInt());

        System.out.println("Ingrese el nombre de la rutina:");

        ingreso.nextLine();

        rutina.setNombre(ingreso.nextLine());

        System.out.println("Ingrese la duración de la rutina:");

        rutina.setDuracion(ingreso.nextInt());

        System.out.println("Ingrese la dificultad de nivel de dificultad de la rutina:");

        ingreso.nextLine();

        rutina.setNivelDificultad(ingreso.nextLine());

        ListaRutinas.add(rutina);

    }
    
    public void obtenerRutinas() {

        for (Rutina rutina : ListaRutinas) {

            System.out.println(rutina.toString());

        }

    }

    public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad) {
        
        int indice = 0;

        Rutina rutinaActualizada;
        
        for (Rutina rutina : ListaRutinas) {

            if (rutina.getId() == id) {

                indice = ListaRutinas.indexOf(rutina);

                rutinaActualizada = new Rutina(id, nombre, duracion, nivelDificultad);

                ListaRutinas.set(indice, rutinaActualizada);

                break;

            }
            
        }
        
    }

    public void eliminarRutina(int id) {

        int indice = 0;

        for (Rutina rutina : ListaRutinas) {

            if (rutina.getId() == id) {

                indice = ListaRutinas.indexOf(rutina);

                ListaRutinas.remove(indice);

                break;

            }

        }

    }
    
}
