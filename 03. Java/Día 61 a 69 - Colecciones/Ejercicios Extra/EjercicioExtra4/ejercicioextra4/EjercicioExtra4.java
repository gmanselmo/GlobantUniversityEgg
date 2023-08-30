package ejercicioextra4;

import Servicio.CodigosPostalesService;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra4 {

    
    public static void main(String[] args) {
        
        CodigosPostalesService cps = new CodigosPostalesService();
        
        //Almacenar 10 ciudades a elección.
        
        cps.almacenarDiez();
        
        //Solicitar 10 ciudades.
        
        for (int i = 0; i < 10; i++) {
            
            cps.solicitarDatos();
            
        }

        //Mostrar datos cargados.
        cps.mostrarCiudades();
        
        //Buscar por codigo.
        
        cps.buscarPorCodigo();
        
        //Mostrar por pantalla los datos
        cps.mostrarCiudades();
        
        //Agregar una ciudad con su código postal correspondiente más al HashMap.
        cps.solicitarDatos();
        
        //Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
        for (int i = 0; i < 3; i++) {
            
            cps.eliminarCiudad();
            
        }
        
        //Mostrar por pantalla los datos
        cps.mostrarCiudades();
        
    }
    
}
