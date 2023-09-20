package Entity;

import Enums.Gym;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class Hotel5Stars extends Hotel4Stars {

    private int conferenceRoomQuantity;
    private int totalSuites;
    private int totalLimousine;

    public Hotel5Stars() {
    }

    public Hotel5Stars(int conferenceRoomQuantity, int totalSuites, int totalLimousine, Gym gym, String restaurantName, int restaurantCapacity, int rooms, int beds, int floors, double roomPrice, String name, String address, String localArea, String manager) {
        super(gym, restaurantName, restaurantCapacity, rooms, beds, floors, roomPrice, name, address, localArea, manager);
        this.conferenceRoomQuantity = conferenceRoomQuantity;
        this.totalSuites = totalSuites;
        this.totalLimousine = totalLimousine;
    }

    public int getConferenceRoomQuantity() {
        return conferenceRoomQuantity;
    }

    public void setConferenceRoomQuantity(int conferenceRoomQuantity) {
        this.conferenceRoomQuantity = conferenceRoomQuantity;
    }

    public int getTotalSuites() {
        return totalSuites;
    }

    public void setTotalSuites(int totalSuites) {
        this.totalSuites = totalSuites;
    }

    public int getTotalLimousine() {
        return totalLimousine;
    }

    public void setTotalLimousine(int totalLimousine) {
        this.totalLimousine = totalLimousine;
    }

    @Override
    public String toString() {
        return "Hotel5Stars{" + super.superToString() + " conferenceRoomQuantity=" + conferenceRoomQuantity + ", totalSuites=" + totalSuites + ", totalLimousine=" + totalLimousine + '}';
    }

}
