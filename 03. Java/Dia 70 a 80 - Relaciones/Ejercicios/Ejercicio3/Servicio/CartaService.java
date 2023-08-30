package Servicio;

import Entidad.Carta;
import java.util.ArrayList;

/**
 *
 * @author Germán M. Anselmo
 */
public class CartaService {

    public ArrayList<Carta> cargarCartas() {
        
        ArrayList<Carta> baraja = new ArrayList();
        
        String[] palos = {"oro", "espada", "basto", "copa"};

        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 13; j++) {

                Carta carta = new Carta();

                if (!(j == 8) && !(j == 9)) {

                    carta.setNumero(j);

                    carta.setPalo(palos[i]);
                    
                    baraja.add(carta);

                }
                
            }

        }
        
    return baraja;

    }
    
}
