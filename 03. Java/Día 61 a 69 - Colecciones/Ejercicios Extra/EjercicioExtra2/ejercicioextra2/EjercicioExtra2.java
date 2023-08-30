package ejercicioextra2;

import Servicio.CantanteFamosoServicio;

/**
 *
 * @author Germán Anselmo.
 */

public class EjercicioExtra2 {

    public static void main(String[] args) {
        
        CantanteFamosoServicio cfs = new CantanteFamosoServicio();
        
        //Cargar 5 manualmente.
        cfs.cargaDirecta("Soda Stereo", "Live 03.");
        cfs.cargaDirecta("Palito Ortega", "Live 03.");
        cfs.cargaDirecta("Cesar Banana Pueyrredon", "Live 03.");
        cfs.cargaDirecta("Cristian Castro", "Live 03.");
        cfs.cargaDirecta("Luis Miguel", "Live 03.");

        //Mostrar cantantes cargados.
        cfs.mostrarCantantesFamosos();
        
        //Menu usuario.
        cfs.menuUsuario();
        
        //Mostrar lista final.
        cfs.mostrarCantantesFamosos();
        
    }
    
}
