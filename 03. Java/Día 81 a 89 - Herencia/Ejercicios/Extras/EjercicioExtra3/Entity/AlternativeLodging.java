package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public abstract class AlternativeLodging extends Lodging {
    
    protected boolean isPrivate;
    protected double m2;

    public AlternativeLodging() {
    }

    public AlternativeLodging(boolean isPrivate, double m2, String name, String address, String localArea, String manager) {
        super(name, address, localArea, manager);
        this.isPrivate = isPrivate;
        this.m2 = m2;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return  super.toString() + ", isPrivate=" + isPrivate + ", m2=" + m2;
    }

}
