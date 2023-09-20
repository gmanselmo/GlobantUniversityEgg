package Comparators;

import Service.HotelService;
import java.util.Comparator;

/**
 *
 * @author Germán M. Anselmo.
 */

public class PriceComparator implements Comparator<HotelService> {
    
    @Override
    public int compare(HotelService hotel1, HotelService hotel2) {
        
        return Double.compare(hotel2.getRoomPrice(), hotel1.getRoomPrice());
        
    }
    
}
