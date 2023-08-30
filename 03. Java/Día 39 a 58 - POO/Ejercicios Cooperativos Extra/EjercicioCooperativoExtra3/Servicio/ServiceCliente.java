package Servicio;

import java.util.ArrayList;

import java.util.Scanner;

import Entidad.Cliente;

public class ServiceCliente {

    Scanner ingreso = new Scanner(System.in);

    ArrayList<Cliente> ListaClientes = new ArrayList<>();

    public void registrarCliente() {

        Cliente cliente = new Cliente();

        System.out.println("Ingrese el ID del cliente:");

        cliente.setId(ingreso.nextInt());

        System.out.println("Ingrese el nombre del cliente:");

        ingreso.nextLine();

        cliente.setNombre(ingreso.nextLine());

        System.out.println("Ingrese la edad del cliente:");

        cliente.setEdad(ingreso.nextInt());

        System.out.println("Ingrese la altura del cliente:");

        cliente.setAltura(ingreso.nextInt());

        System.out.println("Ingrese  el peso del cliente:");

        cliente.setPeso(ingreso.nextInt());
        
        System.out.println("Ingrese el objetivo del cliente:");

        ingreso.nextLine();

        cliente.setObjetivo(ingreso.nextLine());

        ListaClientes.add(cliente);

    }
    
    public void obtenerClientes() {

        for (Cliente cliente : ListaClientes) {

            System.out.println(cliente.toString());

        }

    }

    public void actualizarCliente(int id, String nombre, int edad, int altura, int peso, String objetivo) {
        
        int indice = 0;

        Cliente clienteActualizado;
        
        for (Cliente cliente : ListaClientes) {

            if (cliente.getId() == id) {

                indice = ListaClientes.indexOf(cliente);

                clienteActualizado = new Cliente(id, nombre, edad, altura, peso, objetivo);

                ListaClientes.set(indice, clienteActualizado);

                break;

            }
            
        }
        
    }

    public void eliminarCliente(int id) {

        int indice = 0;

        for (Cliente cliente : ListaClientes) {

            if (cliente.getId() == id) {

                indice = ListaClientes.indexOf(cliente);

                ListaClientes.remove(indice);

                break;

            }

        }

    }
    
}
