package Entidad;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Jugador {
    
    private int id = 0;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "JugadorService{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
}
