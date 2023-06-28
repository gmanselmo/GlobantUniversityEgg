package Entidades;

/**
 *
 * @author Germán Anselmo.
 */

public class Rombo {
    
    private Double lado;
    private Double diagonalChica;
    private Double diagonalGrande;

    public Rombo() {
    }

    public Rombo(Double lado, Double diagonalChica, Double diagonalGrande) {
        this.lado = lado;
        this.diagonalChica = diagonalChica;
        this.diagonalGrande = diagonalGrande;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public void setDiagonalChica(Double diagonalChica) {
        this.diagonalChica = diagonalChica;
    }

    public void setDiagonalGrande(Double diagonalGrande) {
        this.diagonalGrande = diagonalGrande;
    }

    public Double getLado() {
        return lado;
    }

    public Double getDiagonalChica() {
        return diagonalChica;
    }

    public Double getDiagonalGrande() {
        return diagonalGrande;
    }    
    
}
