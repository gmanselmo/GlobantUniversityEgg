package EjercicioCooperativoExtra3;

import Servicio.ServiceCliente;

import Servicio.ServiceRutina;

public class ejerciciocooperativoextra3 {

    public static void main(String[] args) {
        
        //Instanciar servicios.
        ServiceCliente ServiceCliente = new ServiceCliente();

        ServiceRutina ServiceRutina = new ServiceRutina();


        //Crear 5 clientes.
        for (int i = 0; i < 5; i++) {

            ServiceCliente.registrarCliente();

        }
        

        //Crear 5 rutinas.

        for (int i = 0; i < 5; i++) {

            ServiceRutina.registrarRutina();

        }
        

        //Lectura.
        ServiceCliente.obtenerClientes();

        ServiceRutina.obtenerRutinas();

        
        //Actualización.
        ServiceCliente.actualizarCliente(1, "Juancho", 55, 201, 75, "Subir de peso.");

        ServiceCliente.obtenerClientes();

        ServiceRutina.actualizarRutina(1,  "Abdominales", 20, "Intermedio");

        ServiceRutina.obtenerRutinas();


        //Eliminación.
        ServiceCliente.eliminarCliente(1);

        ServiceCliente.obtenerClientes();

        ServiceRutina.eliminarRutina(1);

        ServiceRutina.obtenerRutinas();

    }

}
