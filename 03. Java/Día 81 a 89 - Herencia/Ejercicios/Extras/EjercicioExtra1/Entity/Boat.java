package Entity;

import java.time.LocalDate;

/**
 *
 * @author Germán M. Anselmo
 */
public abstract class Boat {

    protected String plate;
    protected double loa;
    protected LocalDate manufacturingDate;

    public Boat() {
    }

    public Boat(String plate, double loa, LocalDate manufacturingDate) {
        this.plate = plate;
        this.loa = loa;
        this.manufacturingDate = manufacturingDate;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getLoa() {
        return loa;
    }

    public void setLoa(double loa) {
        this.loa = loa;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "plate=" + plate + ", loa=" + loa + ", manufacturingDate=" + manufacturingDate;
    }
    
}
