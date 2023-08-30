package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo
 */

public class Cine {
    private Pelicula pelicula;   
    private Asiento[][] asientos;
    private Integer precioEntreda;
    private ArrayList<Espectador> espectadores;

    public Cine() {
        this.espectadores = new ArrayList();
        this.asientos = new Asiento[8][6];
    }

    public Cine(Pelicula pelicula, Integer precioEntreda) {
        this.pelicula = pelicula;
        this.precioEntreda = precioEntreda;
        this.asientos = new Asiento[8][6];
        this.espectadores = new ArrayList();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Integer getPrecioEntreda() {
        return precioEntreda;
    }

    public void setPrecioEntreda(Integer precioEntreda) {
        this.precioEntreda = precioEntreda;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", asientos=" + asientos + ", precioEntreda=" + precioEntreda + ", espectadores=" + espectadores + '}';
    }

}
