package genericos;

import Entidad.Mascota;
import Enums.RazaGato;
import Enums.RazaPerro;

/**
 *
 * @author Germán M. Anselmo
 */

public class Genericos {

    public static void main(String[] args) {

        Mascota m1 = new Mascota<RazaPerro>("Cosco", "Co");
        
        m1.setRaza(RazaPerro.BEAGLE);
                
        System.out.println(m1);
        
        Mascota m2 = new Mascota<RazaGato>("Gatin", "Ga");
        
        m2.setRaza(RazaGato.NARANJA);
                
        System.out.println(m2);
        
        
    }
    
}
