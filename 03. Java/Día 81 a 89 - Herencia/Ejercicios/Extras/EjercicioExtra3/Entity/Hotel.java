package Entity;

/**
 *
 * @author Germán M. Anselmo.
 */

public abstract class Hotel extends Lodging {

    protected int rooms;
    protected int beds;
    protected int floors;
    protected double roomPrice;

    public Hotel() {
    }

    public Hotel(int rooms, int beds, int floors, double roomPrice, String name, String address, String localArea, String manager) {
        super(name, address, localArea, manager);
        this.rooms = rooms;
        this.beds = beds;
        this.floors = floors;
        this.roomPrice = roomPrice;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return super.toString() + ", rooms=" + rooms + ", beds=" + beds + ", floors=" + floors + ", roomPrice=" + roomPrice;
    }

}
