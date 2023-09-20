 package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */

public final class Yacht extends Boat {
    
    private int horsePower;
    private int cabinQuantity;

    public Yacht() {
    }

    public Yacht(int horsePower, int cabinQuantity, String plate, double loa, LocalDate manufacturingDate) {
        super(plate, loa, manufacturingDate);
        this.horsePower = horsePower;
        this.cabinQuantity = cabinQuantity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCabinQuantity() {
        return cabinQuantity;
    }

    public void setCabinQuantity(int cabinQuantity) {
        this.cabinQuantity = cabinQuantity;
    }

    @Override
    public String toString() {
        return "Yacht{" + super.toString() + " horsePower=" + horsePower + ", cabinQuantity=" + cabinQuantity + '}';
    }
    
}
