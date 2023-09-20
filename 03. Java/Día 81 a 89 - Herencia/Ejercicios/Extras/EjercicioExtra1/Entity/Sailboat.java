package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */

public final class Sailboat extends Boat {
    
    private int mast;

    public Sailboat() {
    }

    public Sailboat(int mast, String plate, double loa, LocalDate manufacturingDate) {
        super(plate, loa, manufacturingDate);
        this.mast = mast;
    }

    public int getMast() {
        return mast;
    }

    public void setMast(int mast) {
        this.mast = mast;
    }

    @Override
    public String toString() {
        return "Sailboat{" + super.toString() + " mast=" + mast + '}';
    }

}
