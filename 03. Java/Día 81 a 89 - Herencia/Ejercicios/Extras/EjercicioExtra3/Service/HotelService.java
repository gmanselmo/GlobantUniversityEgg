package Service;

/**
 *
 * @author Germán M. Anselmo.
 */

public abstract class HotelService extends LodgingService {
    
    double roomPrice;

    public double getRoomPrice() {
        return roomPrice;
    }

    public abstract void roomPrice();
    
}
