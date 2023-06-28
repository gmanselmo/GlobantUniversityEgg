package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Germán Anselmo.
 */

public class MatematicaService {
    
    Matematica matematica = new Matematica();
 
    public void cargarMatemática() {
        
        matematica.setNum1(Math.random());
        
        matematica.setNum2(Math.random());
        
    }
    
    public Double devolverMayor(){
        
        return Math.max(matematica.getNum1(), matematica.getNum2());
    
    }
    
    public void calcularPotencia(){
        
        Double mayor = Math.max(matematica.getNum1(), matematica.getNum2());
        
        Double menor = Math.min(matematica.getNum1(), matematica.getNum2());
        
        Double potencia = Math.pow(mayor, menor);
        
        System.out.println("La potencia del mayor elevado al menor es " + potencia + ".");

    }
    
    public void calculaRaiz() {
        
        Double menor = Math.min(matematica.getNum1(), matematica.getNum2());
        
        menor = Math.abs(menor);
        
        menor = Math.sqrt(menor);
        
        System.out.println("La raiz del menor absoluto es: " + menor + ".");
        
    }

}
