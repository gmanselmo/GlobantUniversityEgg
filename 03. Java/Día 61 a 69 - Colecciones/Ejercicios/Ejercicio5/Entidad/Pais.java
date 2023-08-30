package Entidad;

import java.util.Objects;

/**
 *
 * @author Germán Anselmo.
 */

public class Pais {
    
    private String paisNombre;

    public Pais() {
    }

    public Pais(String paisNombre) {
        this.paisNombre = paisNombre;
    }

    public String getPaisNombre() {
        return paisNombre;
    }

    public void setPaisNombre(String paisNombre) {
        this.paisNombre = paisNombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "paisNombre=" + paisNombre + '}';
    }

}
