package Enums;

/**
 *
 * @author Germán M. Anselmo
 */
public enum Enumerator {
    
    BEAGLE(1, "Beagle"), Pitbull(2, "Pitbull"), OVEJERO(3, "Ovejero");
    
    private Integer codigo;
    private String valor;
    
    private Enumerator(Integer codigo, String valor) {
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
