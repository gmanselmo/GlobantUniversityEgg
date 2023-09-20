package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class Residence extends AlternativeLodging {
    
   private int totalRooms;
   private boolean hasDiscount;
   private boolean hasSportField;

    public Residence() {
    }

    public Residence(int totalRooms, boolean hasDiscount, boolean hasSportField, boolean isPrivate, double m2, String name, String address, String localArea, String manager) {
        super(isPrivate, m2, name, address, localArea, manager);
        this.totalRooms = totalRooms;
        this.hasDiscount = hasDiscount;
        this.hasSportField = hasSportField;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public boolean hasSportField() {
        return hasSportField;
    }

    public void setHasSportField(boolean hasSportField) {
        this.hasSportField = hasSportField;
    }

    @Override
    public String toString() {
        return "Residence{" + super.toString() + ", totalRooms=" + totalRooms + ", hasDiscount=" + hasDiscount + ", hasSportField=" + hasSportField + '}';
    }

}
