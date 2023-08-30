package Entidad;

import java.util.HashMap;

/**
 *
 * @author Germán Anselmo.
 */

public class Producto {
    
    private HashMap<String, Double> tienda = new HashMap();

    public Producto() {
    }

    public HashMap<String, Double> getTienda() {
        return tienda;
    }

    public void setTienda(HashMap<String, Double> tienda) {
        this.tienda = tienda;
    }

}
