package Entidad;

import java.util.Date;

/**
 *
 * @author Germán Anselmo.
 */

public class Persona {
    
    private String nombre;
    private Date fechaNacimiento;
    
    public Persona(){
    }
    
    public Persona(String nombre, Date fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + this.nombre + ", fechaNacimiento=" + this.fechaNacimiento + '}';
    }
    
}
