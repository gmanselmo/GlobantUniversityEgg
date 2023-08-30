package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Germán Anselmo.
 */

public class Equipo {
    
    private ArrayList<Jugador> plantel = new ArrayList();

    public Equipo() {
    }

    public ArrayList<Jugador> getPlantel() {
        return plantel;
    }

    public void setPlantel(ArrayList<Jugador> plantel) {
        this.plantel = plantel;
    }

    @Override
    public String toString() {
        return "Equipo{" + "plantel=" + plantel + '}';
    }
    
}
