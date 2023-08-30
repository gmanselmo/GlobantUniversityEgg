package Servicio;

import Entidad.Baraja;
import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Germán M. Anselmo
 */

public class BarajaService {
    
    CartaService cartas = new CartaService();
    
    Baraja baraja = new Baraja();
    
    ArrayList<Carta> descartadas = new ArrayList();
    
    Scanner ingreso = new Scanner(System.in);
    
    public void llenarBaraja() {
        
        baraja.setBaraja(cartas.cargarCartas());
        
    }
    
    public void barajar() {
        
        Collections.shuffle(baraja.getBaraja());

    }
    
    public void siguienteCarta() {
        
        if (!(baraja.getBaraja().isEmpty())) {
            
            System.out.println("La próxima carta es: " + baraja.getBaraja().get(0) + ".");
        
            descartadas.add(baraja.getBaraja().get(0));

            baraja.getBaraja().remove(0);
            
        } else {
            
            System.out.println("No hay más cartas.");
            
        }
        
    }
    
    public void cartasDisponibles() {
        
        System.out.println("Aún se pueden repartir " + baraja.getBaraja().size() + " cartas.");
        
    }
    
    public void darCartas() {
        
        System.out.println("Cuántas cartas quiere?");
        
        int cant = ingreso.nextInt ();
               
        ingreso.nextLine();
        
        if (baraja.getBaraja().size() >= cant) {
            
            System.out.println("Cartas dadas:");
            
            Iterator<Carta> iterator = baraja.getBaraja().iterator();
            
            while ((iterator.hasNext()) && (cant > 0)) {

                Carta carta = iterator.next();

                System.out.println(carta);       

                descartadas.add(carta);

                iterator.remove();
                
                cant--;
                
            }

        } else {
            
            System.out.println("No hay cartas suficientes.");
            
        }
        
    }
    
    public void cartasMonton() {
        
        if (descartadas.isEmpty()) {
            
            System.out.println("Aun no has descartado ninguna carta.");
            
        } else {
            
            System.out.println("Descartadas: ");
            
            for (Carta descartada : descartadas) {
                
                System.out.println(descartada);
                
            }

        } 
 
    }    
    
    public void mostrarBaraja() {
        
        if (baraja.getBaraja().size() > 0) {
            
            System.out.println("Cartas baraja:");
            
            for (Carta carta : baraja.getBaraja()) {
                
                System.out.println(carta);

            }
                        
        } else {
            
            System.out.println("La baraja está vacía.");
            
        }

    }
        
}
