package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Germán Anselmo.
 */

public class CuentaService {
    
    public static Cuenta crearCuenta(){
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese su número de DNI:");
        
        Cuenta cuenta = new Cuenta(ingreso.nextLong());
        
        return cuenta;
        
    }
    
    public static void ingresar(int ingreso, Cuenta cuenta) {

        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
        
        System.out.println("Ha ingresado $" + ingreso + ".");

    }
    
    public static void retirar(int retiro, Cuenta cuenta) {
        
        if (cuenta.getSaldoActual() >= retiro) {
            
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            
            System.out.println("Ha retirado $" + retiro + ".");
            
        } else {
            
            System.out.println("Saldo insuficiente.");
            
        }
        
    }
        
    public static void extraccionRapida(int retiroRapido, Cuenta cuenta) {
        
        if (retiroRapido <= (cuenta.getSaldoActual() * 0.2)) {
            
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiroRapido);
            
            System.out.println("Ha retirado $" + retiroRapido + ".");
            
        } else {
            
            System.out.println("Solo puede retirar hasta un 20% de su saldo actual.");
            
        }

    }
    
    
    public static void consultarSaldo(Cuenta cuenta) {
        
        System.out.println("Su saldo actual es $" + cuenta.getSaldoActual() + ".");
        
    }
    
    public static void consultarDatos(Cuenta cuenta) {
        
        System.out.println("Numero Cuenta: " + cuenta.getNumeroCuenta() + ".");
        
        System.out.println("DNI Cliente: " + cuenta.getDniCliente()+ ".");
        
        System.out.println("Saldo Actual: " + cuenta.getSaldoActual()+ ".");
        
    }
    
}
