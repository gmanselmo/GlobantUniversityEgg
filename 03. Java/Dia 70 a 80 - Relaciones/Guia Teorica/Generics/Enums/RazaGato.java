package Enums;

/**
 *
 * @author Germán M. Anselmo
 */

public enum RazaGato {
    
    NARANJA(1, "Naranja"), NEGRO(2, "Negro"), GATO(3, "Gato");
    
    private Integer codigo;
    private String valor;
    
    private RazaGato(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
}
