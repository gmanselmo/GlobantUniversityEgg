package Servicio;

import Entidad.Vehiculo;
import java.util.Scanner;

public class VehiculoService {

    Scanner read = new Scanner(System.in);
    Vehiculo vehiculo = new Vehiculo();

    public Vehiculo crearVehiculo() {

        System.out.println("Ingrese el tipo");
        vehiculo.setTipo(read.nextLine());
        System.out.println("Ingrese la marca");
        vehiculo.setMarca(read.nextLine());
        System.out.println("Ingrese el modelo");
        vehiculo.setModelo(read.nextLine());
        System.out.println("Ingrese el año");
        vehiculo.setAnio(read.nextInt());

        return vehiculo;

    }

    public String getTipoVehiculo() {
        return vehiculo.getTipo();
    }

    public int Moverse(int segundos) {
        int resultado = 0;
        if (vehiculo.getTipo().equals("bicicleta")) {
            resultado = segundos;
        } else if (vehiculo.getTipo().equals("motocicleta")) {
            resultado = 2 * segundos;
        } else if (vehiculo.getTipo().equals("automovil")) {
            resultado = 3 * segundos;
        } else {
            System.out.println("Vehiculo invalido");
        }
        return resultado;
    }

    public static void Frenar(int r1, int r2, int r3, String tipo1, String tipo2, String tipo3) {

        int maximo = Math.max(r1, Math.max(r2, r3));

        if ((r1 == maximo) && (!tipo1.equals("bicicleta"))) {
            maximo += 2;
            System.out.println("Trás frenar recorrió " + maximo + " y fue " + tipo1);
        } else if ((r2 == maximo) && (!tipo2.equals("bicicleta"))) {
            maximo += 2;
            System.out.println("Trás frenar recorrió " + maximo + " y fue " + tipo2);
        } else if ((r3 == maximo) && (!tipo3.equals("bicicleta"))) {
            maximo += 2;
            System.out.println("Trás frenar recorrió " + maximo + " y fue " + tipo3);
        } else if ((r1 == maximo) && (tipo1.equals("bicicleta"))) {
            System.out.println("Trás frenar recorrió " + maximo + " y fue " + tipo1);
        } else if ((r2 == maximo) && (tipo2.equals("bicicleta"))) {
            System.out.println("Trás frenar recorrió " + maximo + " y fue " + tipo2);
        } else if ((r3 == maximo) && (tipo3.equals("bicicleta"))) {
            System.out.println("Trás frenar recorrió " + maximo + " y fue " + tipo3);
        }
    }

}
