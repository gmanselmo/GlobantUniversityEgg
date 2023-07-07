package Entidad;

import java.util.Date;

/**
 *
 * @author Germán Anselmo.
 */

public class Alquiler {
    private String pelicula;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String pelicula, Date fechaInicio, Date fechaFin, double precio) {
        this.pelicula = pelicula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getPelicula() {
        return pelicula;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "pelicula=" + pelicula + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precio=" + precio + '}';
    }

}
