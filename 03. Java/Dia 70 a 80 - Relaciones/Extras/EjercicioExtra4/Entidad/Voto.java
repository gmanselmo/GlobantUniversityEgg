package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo
 */

public class Voto {
    
    Alumno alumno;
    ArrayList<Alumno> alumnosVotados = new ArrayList();

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Voto(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "VOTADOS{" + alumnosVotados + '}';
    }

}
