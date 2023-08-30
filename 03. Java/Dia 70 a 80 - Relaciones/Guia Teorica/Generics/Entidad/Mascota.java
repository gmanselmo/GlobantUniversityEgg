package Entidad;

/**
 *
 * @author Germán M. Anselmo
 */

public class Mascota<T> {
    
    private String nombre;
    private String apodo;
    private T raza;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo) {
        this.nombre = nombre;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + '}';
    }

}
