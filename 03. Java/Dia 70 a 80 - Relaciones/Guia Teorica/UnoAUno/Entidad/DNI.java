package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class DNI {
    
    private char serie;
    private int numero;

    public DNI() {
    }

    public DNI(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
}
