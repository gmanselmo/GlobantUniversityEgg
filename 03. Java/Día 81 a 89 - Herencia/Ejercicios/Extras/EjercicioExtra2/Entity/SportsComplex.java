package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class SportsComplex extends Building {
    
    private boolean roofed;

    public SportsComplex(boolean roofed, double width, double height, double length) {
        super(width, height, length);
        this.roofed = roofed;
    }

    public boolean isRoofed() {
        return roofed;
    }

    public void setRoofed(boolean roofed) {
        this.roofed = roofed;
    }

    @Override
    public String toString() {
        return "SportsComplex{" + super.toString() + " " + "roofed=" + roofed + '}';
    }

}
