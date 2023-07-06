package Entidad;

/**
 *
 * @author Germán Anselmo.
 */

public class Ahorcado {
    
    private char[] palabra;
    private int cantidadLetrasEncontradas;
    private int cantidadJugadasMáximas;
    private int encontradas;
    private String[] revelada;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantidadLetrasEncontradas, int cantidadJugadasMáximas, int encontradas, String[] revelada) {
        this.palabra = palabra;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMáximas = cantidadJugadasMáximas;
        this.encontradas = encontradas;
        this.revelada = revelada;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public void setCantidadJugadasMáximas(int cantidadJugadasMáximas) {
        this.cantidadJugadasMáximas = cantidadJugadasMáximas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public void setRevelada(String[] revelada) {
        this.revelada = revelada;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMáximas() {
        return cantidadJugadasMáximas;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public String[] getRevelada() {
        return revelada;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + '}';
    }
        
}
