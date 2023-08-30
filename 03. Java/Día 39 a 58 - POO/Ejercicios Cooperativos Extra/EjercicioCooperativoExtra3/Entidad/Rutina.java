package Entidad;

public class Rutina {

    private int id;
    private String nombre;
    private int duracion;
    private String nivelDificultad;

    public Rutina() {
    }

    public Rutina(int id, String nombre, int duracion, String nivelDificultad) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }
    
    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public String toString() {
        return "ServiceRutina [id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDificultad="
                + nivelDificultad + "]";
    }
    
}
