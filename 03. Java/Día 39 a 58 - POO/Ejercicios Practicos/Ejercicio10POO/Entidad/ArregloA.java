package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class ArregloA {
    
    private Double[] arreglo;

    public ArregloA() {
        arreglo = new Double[50];
    }

    public ArregloA(Double[] arreglo) {
        this.arreglo = arreglo;
    }

    public Double[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Double[] arreglo) {
        this.arreglo = arreglo;
    }
    
}
