package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class Cuenta {
    
    private int numeroCuenta = (int) (Math.random() * 100000);
    private long dniCliente;
    private int saldoActual = 0;
    
    public Cuenta() {        
    }
    
    public Cuenta(long dniCliente) { 
        this.dniCliente = dniCliente;        
    }

    public void setNumeroCuenta (int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;     
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }
    
}
