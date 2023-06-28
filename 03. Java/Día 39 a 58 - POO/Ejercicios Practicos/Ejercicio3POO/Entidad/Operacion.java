package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class Operacion {
    
    //Atributos.
    private int numero1;
    private int numero2;
    
    
    //Constructores.
    public Operacion() {
        
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
      
    //Setters.
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
       
    //Getters.
    public int getNumero1() {
        return numero1;
    }
    
    public int getNumero2() {
        return numero2;
    }

}
