package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class RaicesService {
    
    Raices raices = new Raices();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void cargarCoeficientes(){
        
        System.out.println("Ingrese en orden 3 coeficientes: ");
        
        raices.setA(ingreso.nextDouble());
        
        raices.setB(ingreso.nextDouble());
        
        raices.setC(ingreso.nextDouble());
        
    }
    
    public Double getDiscriminante() {
        
        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
                
    }

    public boolean tieneRaices() {
        
        return getDiscriminante() >= 0;

    }
    
    public boolean tieneRaiz(){
        
        return getDiscriminante() == 0;
        
    }
    
    public void obtenerRaices() {
        
        boolean tieneraices = tieneRaices();
        
        Double discriminante = getDiscriminante();
        
        if (tieneraices) {
            
            //(-b±√((b^2)-(4*a*c)))/(2*a) 
            Double raiz1 = (-raices.getB() + Math.sqrt(discriminante)) / (2 * raices.getA());
            Double raiz2 = (-raices.getB() - Math.sqrt(discriminante)) / (2 * raices.getA());
            
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
            
        } else {
            
            System.out.println("No hay dos soluciones.");
            
        }
        
    }
    
    public void obtenerRaiz() {
        
        boolean tieneraiz = tieneRaiz();
        
        if (tieneraiz) {
            
            Double raiz = (- raices.getB()) / (2 * raices.getA());
            
            System.out.println("La raíz es : " + raiz);
            
        } 
                
    }
    
    public void calcular() {
        
        if (tieneRaices()) {
            
            obtenerRaices();
            
        } else if (tieneRaiz()) {
            
            obtenerRaiz();
            
        } else {
            
            System.out.println("No tiene soluciones reales.");
            
        }
        
    }
  
}
