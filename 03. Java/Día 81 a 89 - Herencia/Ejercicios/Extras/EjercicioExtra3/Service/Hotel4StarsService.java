package Service;

import Entity.Hotel4Stars;
import Enums.Gym;

/**
 *
 * @author Germán M. Anselmo.
 */

public class Hotel4StarsService extends HotelService {
    
    Hotel4Stars hotel;
    
    public void createLodgin(Gym gym, String restaurantName, int restaurantCapacity, int rooms, int beds, int floors, double roomPrice, String name, String address, String localArea, String manager) {
        
        hotel = new Hotel4Stars(gym, restaurantName, restaurantCapacity, rooms, beds, floors, roomPrice, name, address, localArea, manager);
        
        roomPrice();
        
    }

    @Override
    public void roomPrice() {
        
        int capacity = hotel.getBeds() * hotel.getRooms() * hotel.getFloors();
        
        roomPrice = 50 + capacity + restaurantPrice() + gymPrice();

    }

    @Override
    public void showLodging() {
        
        System.out.println(hotel.toString());
        
        System.out.println(hotel.getName() + "'s room price is: $" + roomPrice + ".");
        
    }
    
    public int restaurantPrice() {
        
        int price = 0;
        int restaurantCapacity = hotel.getRestaurantCapacity();
        
        if (restaurantCapacity < 30 ) {
            
            price = 10;
            
        } else if ((restaurantCapacity > 30) && (restaurantCapacity <= 50)) {
            
            price = 30;
            
        } else if (restaurantCapacity > 50) {
            
            price = 50;
            
        }

        return price;
        
    }
    
    public int gymPrice() {
        
        int price = 0;        

        if (hotel.getGym() == Enums.Gym.A) {
            
            price = 50;
            
        } else if (hotel.getGym() == Enums.Gym.B) {
            
            price = 30;
            
        }
        
        return price;
        
    }

}
