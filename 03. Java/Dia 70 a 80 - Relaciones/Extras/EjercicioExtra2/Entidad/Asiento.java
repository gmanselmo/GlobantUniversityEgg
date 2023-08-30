package Entidad;

import Enum.Letras;

/**
 *
 * @author Germán M. Anselmo
 */

public class Asiento {
    Integer numero;
    Letras letra;
    String ocupado;

    public Asiento() {
    }

    public Asiento(Integer numero, Letras letra) {
        this.numero = numero;
        this.letra = letra;
        this.ocupado = " ";
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Letras getLetra() {
        return letra;
    }

    public void setLetra(Letras letra) {
        this.letra = letra;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return " " + numero + letra + ocupado + " ";
    }
    
}
