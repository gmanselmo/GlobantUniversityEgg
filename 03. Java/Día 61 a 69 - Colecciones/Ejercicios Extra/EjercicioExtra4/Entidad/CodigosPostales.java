package Entidad;

import java.util.HashMap;

/**
 *
 * @author Germán Anselmo.
 */

public class CodigosPostales {
    
    private HashMap<Integer, String> codigospostales = new HashMap<>();

    public CodigosPostales() {
    }

    public HashMap<Integer, String> getCodigospostales() {
        return codigospostales;
    }

    public void setCodigospostales(HashMap<Integer, String> codigospostales) {
        this.codigospostales = codigospostales;
    }

    @Override
    public String toString() {
        return "CodigosPostales{" + "codigospostales=" + codigospostales + '}';
    }

}
