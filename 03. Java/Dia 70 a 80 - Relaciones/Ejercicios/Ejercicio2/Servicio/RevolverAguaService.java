package Servicio;

import Entidad.RevolverAgua;

/**
 *
 * @author Germán M. Anselmo.
 */

public class RevolverAguaService {
    
    RevolverAgua revolver = new RevolverAgua();
    
    public void llenarRevolver() {
        
        revolver.setPosicionActual((int) (Math.random() * 6));
        
        revolver.setPosicionAgua((int) (Math.random() * 6));
        
    }
    
    public boolean mojar() {
        
        return (revolver.getPosicionActual() == revolver.getPosicionAgua());
        
    }
    
    public void siguienteChorro(){
        Integer posicionTambor = revolver.getPosicionActual();
        
        if (posicionTambor == 6) {
            revolver.setPosicionActual(0);
        } else {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        }
        
    }
    
}
