package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */

public final class Motorboat extends Boat {
    
    private int horsePower;
    
    public Motorboat() {
    }

    public Motorboat(int horsePower) {
        this.horsePower = horsePower;
    }

    public Motorboat(int horsePower, String plate, double loa, LocalDate manufacturingDate) {
        super(plate, loa, manufacturingDate);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Motorboat{" + super.toString() + " horsePower=" + horsePower + '}';
    }

}
