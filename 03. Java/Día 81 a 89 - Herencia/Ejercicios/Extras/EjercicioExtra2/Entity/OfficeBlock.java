package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class OfficeBlock extends Building {
    
    private int officesQuantity;
    private int peoplePerOffice;
    private int floors;

    public OfficeBlock(int officesQuantity, int peoplePerOffice, int floors, double width, double height, double length) {
        super(width, height, length);
        this.officesQuantity = officesQuantity;
        this.peoplePerOffice = peoplePerOffice;
        this.floors = floors;
    }

    public int getOfficesQuantity() {
        return officesQuantity;
    }

    public void setOfficesQuantity(int officesQuantity) {
        this.officesQuantity = officesQuantity;
    }

    public int getPeoplePerOffice() {
        return peoplePerOffice;
    }

    public void setPeoplePerOffice(int peoplePerOffice) {
        this.peoplePerOffice = peoplePerOffice;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "OfficeBlock{" + super.toString() + "officesQuantity=" + officesQuantity + ", peoplePerOffice=" + peoplePerOffice + ", floors=" + floors + '}';
    }
    
}
