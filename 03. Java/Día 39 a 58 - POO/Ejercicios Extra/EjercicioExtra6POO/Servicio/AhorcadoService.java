package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class AhorcadoService {

    Ahorcado ahorcado = new Ahorcado();

    Scanner ingreso = new Scanner(System.in);

    public void crearJuego() {

        System.out.println("Ingrese la palabra secreta: ");

        char[] cadena = ingreso.nextLine().toCharArray();

        String[] revelada = new String[cadena.length];

        ahorcado.setPalabra(cadena);

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {

            revelada[i] = "_";

        }

        ahorcado.setRevelada(revelada);

        System.out.println("Ingrese la cantidad de intentos: ");

        ahorcado.setCantidadJugadasMáximas(ingreso.nextInt());

        ingreso.nextLine();

        ahorcado.setCantidadLetrasEncontradas(0);

    }

    public void longitud() {

        System.out.println("La palabra a encontrar tiene " + ahorcado.getPalabra().length + " letras.");

    }

    public void buscar(String letra) {

        int encontrada = 0;

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {

            if (letra.equalsIgnoreCase(String.valueOf(ahorcado.getPalabra()[i]))) {

                encontrada++;

            }

        }

        if (encontrada > 0) {

            System.out.println("La letra es parte de la palabra");

        } else {

            System.out.println("La letra no es parte de la palabra");

        }

    }

    public boolean encontradas(String letra) {

        char letraChar = letra.toLowerCase().charAt(0);

        boolean letraEncontrada = false;

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {

            if (letraChar == Character.toLowerCase(ahorcado.getPalabra()[i])) {

                if (ahorcado.getRevelada()[i].equals("_")) {

                    ahorcado.getRevelada()[i] = letra;

                    letraEncontrada = true;

                }

            }

        }

        if (letraEncontrada) {

            ahorcado.setCantidadLetrasEncontradas(ahorcado.getCantidadLetrasEncontradas() + 1);
        }

        System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getCantidadLetrasEncontradas()
                + ", " + (ahorcado.getPalabra().length - ahorcado.getCantidadLetrasEncontradas()) + ").");

        return letraEncontrada;

    }

    public int intentos() {

        System.out.println("Le quedan " + ahorcado.getCantidadJugadasMáximas() + " intentos.");

        return ahorcado.getCantidadJugadasMáximas();

    }

    public void juego() {

        this.crearJuego();

        int vidasRestantes = ahorcado.getCantidadJugadasMáximas();

        while (vidasRestantes > 0 && ahorcado.getPalabra().length != ahorcado.getCantidadLetrasEncontradas()) {

            this.longitud();

            System.out.println("Ingrese una letra: ");
            String letra = ingreso.nextLine();

            this.buscar(letra);

            boolean encontrada = this.encontradas(letra);

            if (!encontrada) {
                --vidasRestantes;
            }

            System.out.println("Le quedan " + vidasRestantes + " intentos.");

            System.out.println("----------------------------------------------");
        }

        if (ahorcado.getPalabra().length != ahorcado.getCantidadLetrasEncontradas() && vidasRestantes == 0) {
            
            System.out.println("Lo sentimos, no hay más oportunidades");
            
        } else {
            
            System.out.println("¡Felicidades! ¡Ganaste!");
                       
        }
        
        System.out.println("La palabra es " + Arrays.toString(ahorcado.getPalabra()));
        
    }

}
