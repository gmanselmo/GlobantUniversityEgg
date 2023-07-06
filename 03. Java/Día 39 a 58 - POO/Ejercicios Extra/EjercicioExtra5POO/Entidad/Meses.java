package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class Meses {
    
    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public Meses() {
    }

    
    public Meses(String[] mes) {
        this.mes = mes;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }
    
}
