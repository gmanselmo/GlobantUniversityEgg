package Entidades;

/**
 *
 * @author Germán Anselmo.
 */

public class Pentagono {
    
    private Double lado;
    private Double apotema;

    public Pentagono() {
    }

    public Pentagono(Double lado, Double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public Double getLado() {
        return lado;
    }

    public Double getApotema() {
        return apotema;
    }
    
}
