package ejercicio5poo;

import Entidad.Cuenta;
import Servicio.CuentaService;

/**
 *
 * @author Germán Anselmo.
 */

public class Ejercicio5POO {

    public static void main(String[] args) {
        
        Cuenta cliente1  = CuentaService.crearCuenta();
        
        CuentaService.ingresar(1000, cliente1);
        
        CuentaService.retirar(100, cliente1);
        
        CuentaService.extraccionRapida(100, cliente1);
        
        CuentaService.consultarSaldo(cliente1);
        
        CuentaService.consultarDatos(cliente1);
        
    }
    
}
