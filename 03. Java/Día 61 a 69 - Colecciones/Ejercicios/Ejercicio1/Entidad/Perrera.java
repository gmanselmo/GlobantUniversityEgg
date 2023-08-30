package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Germán Anselmo.
 */

public class Perrera {
    
    private ArrayList<String> ListaPerros = new ArrayList();

    public Perrera() {
    }

    public Perrera(ArrayList<String> ListaPerros) {
        this.ListaPerros = ListaPerros;
    }

    public ArrayList<String> getListaPerros() {
        return ListaPerros;
    }

    public void setListaPerros(ArrayList<String> ListaPerros) {
        this.ListaPerros = ListaPerros;
    }

    @Override
    public String toString() {
        return "Perrera{" + "ListaPerros=" + ListaPerros + '}';
    }
        
}
