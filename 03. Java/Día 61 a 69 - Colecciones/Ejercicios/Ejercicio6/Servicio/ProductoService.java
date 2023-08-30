package Servicio;

import Entidad.Producto;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */
public class ProductoService {

    Scanner ingreso = new Scanner(System.in);

    Producto producto = new Producto();

    public void cargarProducto() {

        System.out.println("Ingrese el producto:");

        String nombre = ingreso.nextLine();

        System.out.println("Ingrese el precio:");

        Double precio = ingreso.nextDouble();

        ingreso.nextLine();

        producto.getTienda().put(nombre, precio);

    }

    public void modificarPrecio() {

        System.out.println("Ingrese el producto a cambiar el precio:");

        String productoBuscado = ingreso.nextLine();
        
        Double precio;

        for (Map.Entry<String, Double> entry : producto.getTienda().entrySet()) {

            if (entry.getKey().equalsIgnoreCase(productoBuscado)) {
                
                System.out.println("Ingrese el precio:");

                precio = ingreso.nextDouble();

                ingreso.nextLine();

                entry.setValue(precio);

                System.out.println("Precio cambiado.");

            } else {

                System.out.println("Producto no encontrado.");

            }

        }
    }

    public void eliminarProducto() {

        System.out.println("Ingrese el producto a eliminar:");
        
        String productoBuscado = ingreso.nextLine();

        for (Map.Entry<String, Double> entry : producto.getTienda().entrySet()) {

            if (entry.getKey().equalsIgnoreCase(productoBuscado)) {

                producto.getTienda().remove(entry.getKey());
                
                System.out.println("Producto eliminado.");

            } else {

                System.out.println("Producto no encontrado.");

            }

        }

    }
    
    public void listarProductos(){
        
        for (Map.Entry<String, Double> entry : producto.getTienda().entrySet()) {

            System.out.println(entry);
            
        }
        
    }
    
    public void menuTienda(){
        
        int start = 0;
        
        while (start != 5) {
            
            System.out.println("Ingrese una opción para operar:");
            
            System.out.println("1. Alta producto.");
            
            System.out.println("2. Baja producto.");
            
            System.out.println("3. Modificar producto.");
            
            System.out.println("4. Listar productos.");
            
            System.out.println("5. Salir.");
            
            start = ingreso.nextInt();
            
            ingreso.nextLine();
            
            switch (start) {
                case 1:
                    cargarProducto();
                    break;
                
                case 2:
                    eliminarProducto();
                    break;
                    
                case 3:
                    modificarPrecio();
                    break;
                    
                case 4:
                    listarProductos();
                    break;                    
           
            }
            
            System.out.println("-------------------------------");

        }
        
        System.out.println("Gracias por usar.");
            
        System.out.println("-------------------------------");
  
    }

}
