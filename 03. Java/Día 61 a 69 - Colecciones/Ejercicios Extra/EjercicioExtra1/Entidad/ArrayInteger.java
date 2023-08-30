package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Germán Anselmo.
 */

public class ArrayInteger {
    
    private ArrayList<Integer> listaNumeros = new ArrayList();

    public ArrayInteger() {
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    @Override
    public String toString() {
        return "ArrayInteger{" + "listaNumeros=" + listaNumeros + '}';
    }
    
}
