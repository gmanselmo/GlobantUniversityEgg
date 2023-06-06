package JavaIntro;

import java.util.Scanner;

/**
 *
 * @author Germán Anselmo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner ingreso = new Scanner(System.in);
        
        String[] Equipo = new String[9];
        
        System.out.println("Ingrese el nombre de los compañeros de clase:");
        
        for (int i = 0; i < 9; i++) {
            
            Equipo[i] = ingreso.nextLine();
            
        }
        
        System.out.print("| ");
        
        for (int i = 0; i < 9; i++) {
            
            System.out.print(Equipo[i] + " | ");
            
        }
        
        System.out.println("");
        
    }

}
