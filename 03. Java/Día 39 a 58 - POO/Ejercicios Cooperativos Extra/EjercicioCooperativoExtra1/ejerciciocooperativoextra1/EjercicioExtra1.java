package ejerciciocooperativoextra1;

import Servicio.VehiculoService;

public class EjercicioExtra1 {

    public static void main(String[] args) {
        int recorrido1, recorrido2, recorrido3, segundos;

        VehiculoService v1 = new VehiculoService();
        VehiculoService v2 = new VehiculoService();
        VehiculoService v3 = new VehiculoService();

        v1.crearVehiculo();
        v2.crearVehiculo();
        v3.crearVehiculo();

        //Recorrido en 5 segundos.
        recorrido1 = v1.Moverse(5);
        recorrido2 = v2.Moverse(5);
        recorrido3 = v3.Moverse(5);

        System.out.println("El vehiculo 1 avanzará: " + recorrido1 + "metros en 5 segundos.");
        System.out.println("El vehiculo 2 avanzará: " + recorrido2 + "metros en 5 segundos.");
        System.out.println("El vehiculo 3 avanzará: " + recorrido3 + "metros en 5 segundos.");

        
        //Recorrido en 10 segundos.
        recorrido1 = v1.Moverse(10);
        recorrido2 = v2.Moverse(10);
        recorrido3 = v3.Moverse(10);

        System.out.println("El vehiculo 1 avanzará: " + recorrido1 + "metros en 10 segundos.");
        System.out.println("El vehiculo 2 avanzará: " + recorrido2 + "metros en 10 segundos.");
        System.out.println("El vehiculo 3 avanzará: " + recorrido3 + "metros en 10 segundos.");
        
        //Recorrido en 60 segundos.
        recorrido1 = v1.Moverse(60);
        recorrido2 = v2.Moverse(60);
        recorrido3 = v3.Moverse(60);

        System.out.println("El vehiculo 1 avanzará: " + recorrido1 + "metros en 60 segundos.");
        System.out.println("El vehiculo 2 avanzará: " + recorrido2 + "metros en 60 segundos.");
        System.out.println("El vehiculo 3 avanzará: " + recorrido3 + "metros en 60 segundos.");
        
        
        //Mayor recorrido en 5 minutos tras frenar.
        recorrido1 = v1.Moverse(300);
        recorrido2 = v2.Moverse(300);
        recorrido3 = v3.Moverse(300);
        
        String tipo1 = v1.getTipoVehiculo();
        String tipo2 = v2.getTipoVehiculo();
        String tipo3 = v3.getTipoVehiculo();
        
        //Mayor distancia y tipo tras frenado.
        VehiculoService.Frenar(recorrido1, recorrido2, recorrido3, tipo1, tipo2, tipo3);
        
    }
    
}
