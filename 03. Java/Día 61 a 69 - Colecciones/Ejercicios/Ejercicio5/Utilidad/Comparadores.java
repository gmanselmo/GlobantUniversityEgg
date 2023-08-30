package Utilidad;

import Entidad.Pais;
import java.util.Comparator;

/**
 *
 * @author Germán Anselmo.
 */

public class Comparadores {
    
    public static Comparator<Pais> ordenAZ = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getPaisNombre().compareTo(p2.getPaisNombre());
        }
    }; 
}
