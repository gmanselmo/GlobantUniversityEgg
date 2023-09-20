package Service;

import Entity.Hotel5Stars;
import Enums.Gym;

/**
 *
 * @author Germán M. Anselmo.
 */

public final class Hotel5StarsService extends Hotel4StarsService {
    
    public void createLodgin(int conferenceRoomQuantity, int totalSuites, int totalLimousine, Gym gym, String restaurantName, int restaurantCapacity, int rooms, int beds, int floors, double roomPrice, String name, String address, String localArea, String manager) {
        
        hotel = new Hotel5Stars(conferenceRoomQuantity, totalSuites, totalLimousine, gym, restaurantName, restaurantCapacity, rooms, beds, floors, roomPrice, name, address, localArea, manager);
        
        roomPrice();
        
    }

    @Override
    public void roomPrice() {
        
        int capacity = hotel.getBeds() * hotel.getRooms() * hotel.getFloors();
        
        roomPrice = 50 + capacity + restaurantPrice() + gymPrice() + limousinePrice();
        
    }
    
    public int limousinePrice() {
        
        Hotel5Stars hotel5Stars = (Hotel5Stars) hotel;

        return hotel5Stars.getTotalLimousine() * 15;
        
    }
        
}
