package Entity;

import Enums.Gym;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Hotel4Stars extends Hotel {
    
    private Gym gym;
    private String restaurantName;
    private int restaurantCapacity;

    public Hotel4Stars() {
    }

    public Hotel4Stars(Gym gym, String restaurantName, int restaurantCapacity, int rooms, int beds, int floors, double roomPrice, String name, String address, String localArea, String manager) {
        super(rooms, beds, floors, roomPrice, name, address, localArea, manager);
        this.gym = gym;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public void setRestaurantCapacity(int restaurantCapacity) {
        this.restaurantCapacity = restaurantCapacity;
    }

    @Override
    public String toString() {
        return "Hotel4Stars{" + super.toString() + " gym=" + gym + ", restaurantName=" + restaurantName + ", restaurantCapacity=" + restaurantCapacity + "}.";
    }
    
    public String superToString() {
        return super.toString() + " gym=" + gym + ", restaurantName=" + restaurantName + ", restaurantCapacity=" + restaurantCapacity;
    }

}
