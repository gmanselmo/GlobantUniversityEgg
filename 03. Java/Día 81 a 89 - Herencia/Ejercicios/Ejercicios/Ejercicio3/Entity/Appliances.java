package Entity;

/**
 *
 * @author Germán M. Anselmo
 */

public class Appliances {
    
    protected double price;
    protected String color = "WHITE";
    protected String powerConsumption = "F";
    protected double weight;

    public Appliances() {
    }

    public Appliances(double price, String color, String powerConsumption, double weight) {
        this.price = price;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliances{" + "price=" + price + ", color=" + color + ", powerConsumption=" + powerConsumption + ", weight=" + weight + '}';
    }
    
}
