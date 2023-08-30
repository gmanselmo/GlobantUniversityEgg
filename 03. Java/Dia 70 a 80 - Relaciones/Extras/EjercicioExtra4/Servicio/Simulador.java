package Servicio;

import Entidad.Alumno;
import Entidad.Voto;
import Enum.Apellidos;
import Enum.Nombres;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Germán M. Anselmo
 */
public class Simulador {

    ArrayList<Alumno> alumnos = new ArrayList();
    
    ArrayList<Voto> votos = new ArrayList();


    public ArrayList<String> crearNombres(int cantidadAlumnos) {
        
        ArrayList<String> listaAlumnos = new ArrayList();

        for (int i = 0; i < cantidadAlumnos; i++) {

            Integer nombreRandom = (int) (Math.random() * cantidadAlumnos);

            Integer apellidoRandom = (int) (Math.random() * cantidadAlumnos);

            String nombreCompleto = Nombres.values()[nombreRandom].toString() + " " + Apellidos.values()[apellidoRandom].toString();

            listaAlumnos.add(nombreCompleto);
            
        }
        
        return listaAlumnos;       

    }

    public ArrayList<Integer> generarDNIS(int cantidadAlumnos) {
       
        ArrayList<Integer> listaDNIS = new ArrayList();
        
        for (int i = 0; i < cantidadAlumnos; i++) {

            boolean pass = false;

            while (!pass) {

                Integer dni = (int) (Math.random() * 50000000);

                if ((dni >= 7000000) && (dni < 50000000) && !listaDNIS.contains(dni)) {

                    listaDNIS.add(dni);
                    
                    pass = true;

                }

            }
            
        }

        return listaDNIS;

    }

    public void crearAlumnos(int cantAlumnos) {
        
        ArrayList<String> nombres = crearNombres(cantAlumnos);
        
        ArrayList<Integer> documentos = generarDNIS(cantAlumnos);

        for (int i = 0; i < cantAlumnos; i++) {
                        
            Alumno alumno = new Alumno(nombres.get(i), documentos.get(i));       
            
            alumnos.add(alumno);
            
        }

    }
    
    public void mostrarAlumnos(){
        
        for (Alumno alumno : alumnos) {
            
            System.out.println(alumno);
            
        }        
        
    }
    
    public void votacion() {
        
        for (Alumno alumno : alumnos) {
            
            Voto voto = new Voto(alumno);
            
            for (int i = 0; i < 3; i++) {
                
                int votacion;
                
                do {
                    
                    votacion = (int) (Math.random() * alumnos.size());
                    
                } while (votacion == alumnos.indexOf(alumno) || voto.getAlumnosVotados().contains(alumnos.get(votacion)));

                voto.getAlumnosVotados().add(alumnos.get(votacion));

                alumnos.get(votacion).setCantidadVotos( alumnos.get(votacion).getCantidadVotos() + 1);

            }
            
            votos.add(voto);
            
        }
                
    }
    
    public void mostrarVotaciones(){
        
        for (Voto voto : votos) {
            
            System.out.println(voto.getAlumno().toStringCompleto() + voto);
            
        }        
        
    }
    
    public Comparator<Voto> votoComparator() {
        
        return (voto1, voto2) -> {
            return Integer.compare(voto2.getAlumno().getCantidadVotos(), voto1.getAlumno().getCantidadVotos());
        };
        
    }

    public void recuentoVotos() {
        
        Collections.sort(votos, votoComparator());
        
        System.out.println("FACILITADORES: ");
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println(votos.get(i).getAlumno().toStringCompleto());
            
        }
        
        System.out.println("FACILITADORES SUPLENTES: ");
        
        for (int i = 5; i < 10; i++) {
            
            System.out.println(votos.get(i).getAlumno().toStringCompleto());
            
        }
        
    }

}
