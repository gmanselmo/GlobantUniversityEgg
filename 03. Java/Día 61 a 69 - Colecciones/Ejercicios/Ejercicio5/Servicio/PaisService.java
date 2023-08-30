package Servicio;

import Entidad.Pais;
import Utilidad.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class PaisService {

    Scanner ingreso = new Scanner(System.in);

    HashSet<Pais> paises = new HashSet<>();

    public void cargarPaises() {

        String exit = "no", input;

        while (exit.equals("no")) {

            Pais pais = new Pais();

            System.out.println("Ingrese el nombre del país o 'salir':");

            input = ingreso.nextLine();

            if (input.equalsIgnoreCase("salir")) {

                break;

            } else {

                pais.setPaisNombre(input);

                paises.add(pais);

            }

        }
        
        for (Pais pais : paises) {

            System.out.println(pais);

        }

    }
    
    public void ordenarPaises() {
                
        ArrayList<Pais> paisesList = new ArrayList();
        
        for (Pais pais : paises) {
            
            paisesList.add(pais);
            
        }
        
        Collections.sort(paisesList, Comparadores.ordenAZ);
        
        for (Pais pais : paisesList) {
            
            System.out.println(pais);
            
        }
 
    }
    
    public void buscarPais(){
        
        String paisBuscado;
        
        int contador = 0;
        
        System.out.println("Ingrese un país a buscar y eliminar:");
        
        paisBuscado = ingreso.nextLine();
        
        Iterator<Pais> iterator = paises.iterator();
        
        while (iterator.hasNext()) {
            
              if (iterator.next().getPaisNombre().equalsIgnoreCase(paisBuscado)) {
                  
                  iterator.remove();
                  
                  contador++;
                  
              }
              
        }
        
        if (!(contador == 0)){
            
            System.out.println("País eliminado.");
            
        } else {
            
            System.out.println("País no encontrada.");
            
        }     

    }

}
