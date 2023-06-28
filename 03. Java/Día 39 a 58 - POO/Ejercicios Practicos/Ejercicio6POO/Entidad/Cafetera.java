package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class Cafetera {
    
    private int capacidadMaxima = 1000;
    private int cantidadActual = 500;
    
    public Cafetera() {      
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;        
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }
    
    public int getCantidadActual(){
        return this.cantidadActual;
    }
    
}
