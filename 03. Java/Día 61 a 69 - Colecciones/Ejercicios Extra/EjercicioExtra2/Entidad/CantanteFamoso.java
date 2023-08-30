package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Germán Anselmo.
 */

public class CantanteFamoso {

    private static ArrayList<CantanteFamoso> cf = new ArrayList();
    private String nombre;
    private String discoConMasVEntas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVEntas) {
        this.nombre = nombre;
        this.discoConMasVEntas = discoConMasVEntas;
    }

    public static ArrayList<CantanteFamoso> getCf() {
        return cf;
    }

    public static void setCf(CantanteFamoso cf) {
        CantanteFamoso.cf.add(cf);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVEntas() {
        return discoConMasVEntas;
    }

    public void setDiscoConMasVEntas(String discoConMasVEntas) {
        this.discoConMasVEntas = discoConMasVEntas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoConMasVEntas=" + discoConMasVEntas + '}';
    }
    
}
