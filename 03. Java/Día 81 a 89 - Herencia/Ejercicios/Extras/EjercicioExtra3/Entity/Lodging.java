package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public abstract class Lodging {
    
    protected String name;
    protected String address;
    protected String localArea;
    protected String manager;

    public Lodging() {
    }

    public Lodging(String name, String address, String localArea, String manager) {
        this.name = name;
        this.address = address;
        this.localArea = localArea;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocalArea() {
        return localArea;
    }

    public void setLocalArea(String localArea) {
        this.localArea = localArea;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "name=" + name + ", address=" + address + ", localArea=" + localArea + ", manager=" + manager;
    }

}
