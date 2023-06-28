package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class ArregloB {
    
    private Double[] arreglo;

    public ArregloB() {
        arreglo = new Double[50];
    }

    public ArregloB(Double[] arreglo) {
        this.arreglo = arreglo;
    }

    public Double[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Double[] arreglo) {
        this.arreglo = arreglo;
    }
    
}
