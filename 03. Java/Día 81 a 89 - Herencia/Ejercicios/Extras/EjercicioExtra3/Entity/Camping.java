package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class Camping extends AlternativeLodging {
    
    private int totalTents;
    private int totalBaths;
    private boolean hasRestaurant;

    public Camping() {
    }

    public Camping(int totalTents, int totalBaths, boolean hasRestaurant, boolean isPrivate, double m2, String name, String address, String localArea, String manager) {
        super(isPrivate, m2, name, address, localArea, manager);
        this.totalTents = totalTents;
        this.totalBaths = totalBaths;
        this.hasRestaurant = hasRestaurant;
    }

    public int getTotalTents() {
        return totalTents;
    }

    public void setTotalTents(int totalTents) {
        this.totalTents = totalTents;
    }

    public int getTotalBaths() {
        return totalBaths;
    }

    public void setTotalBaths(int totalBaths) {
        this.totalBaths = totalBaths;
    }

    public boolean hasRestaurant() {
        return hasRestaurant;
    }

    public void setHasRestaurant(boolean hasRestaurant) {
        this.hasRestaurant = hasRestaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + super.toString() + ", totalTents=" + totalTents + ", totalBaths=" + totalBaths + ", hasRestaurant=" + hasRestaurant + '}';
    }

}
