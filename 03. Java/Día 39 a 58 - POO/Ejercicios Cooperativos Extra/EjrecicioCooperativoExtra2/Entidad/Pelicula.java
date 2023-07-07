package Entidad;

import java.util.Date;

/**
 *
 * @author Germán Anselmo.
 */

public class Pelicula {
    private String titulo;
    private String genero;
    private Date anio;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, Date anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public Date getAnio() {
        return anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + ", duracion=" + duracion + '}';
    }
    
}
