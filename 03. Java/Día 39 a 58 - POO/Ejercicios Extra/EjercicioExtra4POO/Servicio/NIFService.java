package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class NIFService {
    
    NIF nif = new NIF();
        
        Scanner ingreso = new Scanner(System.in);
        
        public void crearNif() {
            
            char posiciones[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            
            System.out.println("Ingrese su DNI: ");
            
            nif.setDNI(ingreso.nextLong());
            
            int posicion = (int) (nif.getDNI()) % 23;
            
            nif.setLetra(posiciones[posicion]);
            
        }
            
        public void mostrar() {
            
            System.out.println(nif.getDNI() + "-" + nif.getLetra());
        }            
           
}
