package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Enum.Letras;
import Enum.Nombres;

/**
 *
 * @author Germán M. Anselmo
 */

public class CineService {
    
    Cine sala = new Cine();
    
    AsientoService as = new AsientoService();
    
    public void crearSala(Integer precioEntrada) {
        
        Letras[] letras = Letras.values(); 
        
        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < letras.length; j++) {
                
                sala.getAsientos()[i][j] = as.crearAsiento(i, letras[j]);
                
            }
            
        }
        
        sala.setPrecioEntreda(precioEntrada);

    }
    
    public void mostrarAsientos(){
        
        System.out.println("Sala: " + sala.getPelicula().getTitulo() + ".");
        
        for (int i = 0; i < 8; i++) {
            
            System.out.print("|");
            
            for (int j = 0; j < 6; j++) {
                
                System.out.print(sala.getAsientos()[i][j] + "|");
                
            }

            System.out.println("");
            
        }
        
    }
    
    public void generarClientes() {
        
        Integer random = (int) (Math.random() * 47);
        
        for (int i = 0; i < random; i++) {
            
            Integer dinero = (int) (Math.random() * 100);
            
            Integer edad = (int) (Math.random() * 100);
            
            Nombres[] nombres = Nombres.values(); 

            Espectador espectador = EspectadorService.crearEspectador(nombres[i].toString(), edad, dinero);
            
            sala.getEspectadores().add(espectador);
            
        }
        
    }
    
    public void cargarPelicula(String titulo, Integer duracion, Integer edadMinima, String director) {
        
        Pelicula pelicula = PeliculaService.crearPelicula(titulo, duracion, edadMinima, director);
        
        sala.setPelicula(pelicula);

    }
    
    public void sentarClientes() {
        
        for (Espectador espectador : sala.getEspectadores()) {
            
            if ((espectador.getDineroDisponible() >= sala.getPrecioEntreda()) && (espectador.getEdad() >= sala.getPelicula().getEdadMinima())) {
                
                boolean sentado = false;
                
                while (!sentado) {
                    
                    Integer fila = (int) (Math.random() * 8);
                    
                    Integer columna = (int) (Math.random() * 6);

                    if (sala.getAsientos()[fila][columna].getOcupado().equalsIgnoreCase(" ") ) {
                        
                        sala.getAsientos()[fila][columna].setOcupado("X");
                        
                        sentado = true;
                        
                    }
                        
                }
                
            }
            
        }
        
    }
    
}
