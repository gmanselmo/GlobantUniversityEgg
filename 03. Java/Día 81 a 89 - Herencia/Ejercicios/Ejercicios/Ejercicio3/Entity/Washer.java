package Entity;

/**
 *
 * @author Germán M. Anselmo
 */

public class Washer extends Appliances {
    
    private double capacity;

    public Washer() {
    }

    public Washer(double capacity) {
        this.capacity = capacity;
    }

    public Washer(double capacity, double price, String color, String powerConsumption, double weight) {
        super(price, color, powerConsumption, weight);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Washer{" + "price=" + price + ", color=" + color + ", powerConsumption=" + powerConsumption + ", weight=" + weight + ", capacity=" + capacity + '}';
    }
   
}
