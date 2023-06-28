package Servicio;

import Entidad.ArregloA;
import Entidad.ArregloB;
import java.util.Arrays;

/**
 *
 * @author Germán Anselmo.
 */

public class ArreglosService {
    
    ArregloA arregloA = new ArregloA();
    ArregloB arregloB = new ArregloB();
    
    public void cargarArregloA(){
        
        Double[] arreglo = new Double[50];
                
        for (int i = 0; i < 50; i++) {
            
            arreglo[i] = Math.random();
            
        }
        
        System.out.println("Arreglo A:");
                
        System.out.println(Arrays.toString(arreglo));
        
        Arrays.sort(arreglo);
        
        arregloA.setArreglo(arreglo);
                
    }
    
    public void cargarArregloB(){
        
        Double[] arreglo = new Double[20];
        
        Double[] auxiliar = new Double[10];
        
        auxiliar = Arrays.copyOfRange(arregloA.getArreglo(), 0, 10);
               
        for (int i = 0; i < 20; i++) {
            
            if (i < 10) {
                
                arreglo[i] = auxiliar[i];
                
            } else {
                
                arreglo[i] = 0.5;
                
            }
            
        }
        
        arregloB.setArreglo(arreglo);
        
    }
    
    public void imprimirArreglos() {
        
        System.out.println("Arreglo A Ordenado:");
        
        System.out.println(Arrays.toString(arregloA.getArreglo()));
        
        System.out.println("Arreglo B:");
        
        System.out.println(Arrays.toString(arregloB.getArreglo()));
        
    }
    
}
