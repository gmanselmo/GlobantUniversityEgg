package Entity;

/**
 *
 * @author Germán M. Anselmo
 */

public class TV extends Appliances {
    
    private int inches;
    private boolean tdtTuner = false;

    public TV() {
    }

    public TV(int inches) {
        this.inches = inches;
    }

    public TV(int inches, boolean tdtTuner, double price, String color, String powerConsumption, double weight) {
        super(price, color, powerConsumption, weight);
        this.inches = inches;
        this. tdtTuner = tdtTuner;
    }
    
    

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean isTdtTuner() {
        return tdtTuner;
    }

    public void setTdtTuner(boolean tdtTuner) {
        this.tdtTuner = tdtTuner;
    }

    @Override
    public String toString() {
        return "TV{" + "price=" + price + ", color=" + color + ", powerConsumption=" + powerConsumption + ", weight=" + weight + ", inches=" + inches + ", tdtTuner=" + tdtTuner + '}';
    }

}
