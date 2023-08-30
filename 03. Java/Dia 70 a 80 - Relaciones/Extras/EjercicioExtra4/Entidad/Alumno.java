package Entidad;

/**
 *
 * @author Germán M. Anselmo
 */

public class Alumno {
    
    private String nombreCompleto;
    private Integer DNI;
    private Integer cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer DNI, Integer cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = cantidadVotos;
    }
    
    public Alumno(String nombreCompleto, Integer DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = 0;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Alumno{" + nombreCompleto + ", DNI=" + DNI + '}';
    }
    
    public String toStringCompleto() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", DNI=" + DNI + ", cantidadVotos=" + cantidadVotos + '}';
    }
    
}
