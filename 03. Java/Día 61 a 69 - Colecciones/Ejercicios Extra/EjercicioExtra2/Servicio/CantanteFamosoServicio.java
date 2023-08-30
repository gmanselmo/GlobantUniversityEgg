package Servicio;

import Entidad.CantanteFamoso;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CantanteFamosoServicio {
    
    Scanner ingreso = new Scanner(System.in);
    
    public void cargaDirecta(String nombre, String discoMasVendido) {
        
        CantanteFamoso cf = new CantanteFamoso(nombre, discoMasVendido);
        
        CantanteFamoso.setCf(cf);
    }
    

    public void cargarCantanteFamoso() {
        
        CantanteFamoso cf = new CantanteFamoso();
        
        System.out.println("Ingrese el nombre del/la cantante: ");
        
        cf.setNombre(ingreso.nextLine());
        
        System.out.println("Ingrese el disco más vendido: ");
        
        cf.setDiscoConMasVEntas(ingreso.nextLine());
        
        CantanteFamoso.setCf(cf);
        
    }
    
    public void mostrarCantantesFamosos(){
        
        for (CantanteFamoso cantante : CantanteFamoso.getCf()) {
            
            System.out.println(cantante);
            
        }
    }
     
    public void eliminarCantante(){
        
        System.out.println("Ingrese el nombre de un/a cantante a eliminar: ");
        
        Iterator<CantanteFamoso> iterator = CantanteFamoso.getCf().iterator();
        
        String cantante = ingreso.nextLine();
        
        while (iterator.hasNext()) {
            
            CantanteFamoso cf = iterator.next();

            if (cf.getNombre().equalsIgnoreCase(cantante)) {

                iterator.remove();

                System.out.println("Cantante eliminado/a.");

            }

        }
        
    }
    
    public void menuUsuario(){
        
        int input = 0;
        
        while (input != 4) {
            
            System.out.println("1. Agragar otro cantante.");
        
            System.out.println("2. Mostrar todos los cantante.");
        
            System.out.println("3. Eliminar un cantante.");

            System.out.println("4. Salir.");

            System.out.println("Ingrese una opcion para operar:"); 
            
            input = ingreso.nextInt();
            
            ingreso.nextLine();
            
            switch (input) {
                case 1:
                    cargarCantanteFamoso();
                    break;
                    
                case 2:
                    mostrarCantantesFamosos();
                    break;
                    
                case 3:
                    eliminarCantante();
                    break;
                    
                case 4:
                    System.out.println("Gracias por usar.");
                    break;
                    
            }
            
        }  
        
    }

}
